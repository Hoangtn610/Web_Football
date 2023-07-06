package com.shoppingPage;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.metainfo.ComponentInfo;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Div;

import com.tableDao.ProductDAO;
import com.tableData.Product;

public class ShoppingPageController extends SelectorComposer<Div> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> items;
	private List<Product> productlist;
	
	public List<Product> getProductlist() {
		return productlist;
	}
	public void setProductlist(List<Product> productlist) {
		this.productlist = productlist;
	}
	@WireVariable
	private Div shopPagediv;
	@Override
	public ComponentInfo doBeforeCompose(Page page, Component parent, ComponentInfo compInfo) {
		// TODO Auto-generated method stub
		return super.doBeforeCompose(page, parent, compInfo);
	}
	@Override
	public void doAfterCompose(Div comp) throws Exception {
		// TODO Auto-generated method stub
		super.doAfterCompose(comp);
	}
	public List<String> getItems() {
		return items;
	}
	
	@Init
    public void init() {
		ProductDAO productDAO = new ProductDAO();
		productlist = productDAO.getAllProduct();
    }
}
