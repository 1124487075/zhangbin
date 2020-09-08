package org.cskj.boot.goods.service;

import java.util.List;

import org.cskj.boot.goods.bean.Goods;

public interface GoodsService {

	List<Goods> queryGoodsAll();

	int addGoods(Goods goods);

	int deleteGoods(int id);
}
