package org.cskj.boot.goods.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.cskj.boot.goods.bean.Goods;

@Mapper
public interface GoodsMapper {

	List<Goods> queryGoodsAll();

	int addGoods(Goods goods);

	int deleteGoods(int id);
}
