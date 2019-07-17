package cn.pn.pncommodityprovider.mapper;

import pojo.*;

import java.util.List;

public interface CommodityMapper {
    /**
     * 查询商品 （按搜索框优先查询 一开始按搜索框匹配条件+当前定位城市的默认全部演出分类和全部时间去查询。如果演出分类和选择子类有记录但所定位的城市无匹配记录则显示：搜索框内容+全部城市+匹配父类+匹配子类的匹配条数且按照默认综合排序+全部选座方式查询，如果定位城市有记录，则按搜索框内容+定位城市+匹配父类+匹配子类且按照默认综合排序+全部选座方式查询）
     * @param search 搜索框内容（条件可为空，为空时不增加该条件）
     * @param cityId 所选城市ID（不可为空，无匹配城市则查询全部城市的记录）
     * @param typeId 演出父类ID（可为空，为空时不增加该条件）
     * @param childTypeId 演出子类ID（可为空，为空时不增加该条件，选择父类后展示子类信息）
     * @param date 日期条件（可为空，为空时不增加该条件查询全部日期的匹配记录数）
     * @param sortOrder 排序方式，不可为空默认为1。（页面传值 1综合排序/2最新优先/3低价优先/4好评优先）根据页面传值进行判断并拼接sql语句
     * @param isSeat 是否可以在线选座，不可为空默认为0（0全部选座方式，1可在线选座）
     * @return List<Commodity> 商品集合
     */
    List<Commodity> listCommodities(String search, Integer cityId, Integer typeId, Integer childTypeId, String date, Integer sortOrder, Integer isSeat);

    /**
     * 根据商品ID查询商品
     * @param commodityId 商品ID
     * @return Commodity（商品）
     */
    Commodity getCommodityById(Integer commodityId);

    /**
     * 根据场地ID查询场次
     * @param fieldId
     * @return
     */
    List<Session> listSession(Integer fieldId);

    /**
     * 根据商品ID和场次ID查询SKU
     * @param commodityId 商品ID
     * @param sessionId 场次ID
     * @return
     */
    List <SKU> listSKU(Integer commodityId, Integer sessionId);

    /**
     * 根据商品ID查询购票须知
     * @param commodityId 商品ID
     * @return
     */
    TheTicketInformation getTheTicketInformation(Integer commodityId);

    /**
     * 根据商品ID获得该商品有多少条评价总数
     * @param commodityId 商品ID
     * @return
     */
    Integer getEvaluateCount(Integer commodityId);

    /**
     * 查询所有演出父类别
     * @return
     */
    List<ShowType> listAllType();

    /**
     * 根据父类ID查询演出子类
     * @param typeId 父类ID
     * @return
     */
    List<ShowType> listChildTypeByTypeId(Integer typeId);

    /**
     * 查询折扣商品
     * @return
     */
    List<Commodity> listDisCommodities();

    /**
     * 查询近期热门
     * @return
     */
    List<Commodity> listHotCommodities();

    /**
     * 按演出父类别查询（首页固定展示数据）
     * @param typeId 父类ID
     * @return
     */
    List<Commodity> listCommoditiesByType(Integer typeId);
}
