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

public class ShoppingPageController extends SelectorComposer<Div> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> items;
	private List<product> productlist;
	
	public List<product> getProductlist() {
		return productlist;
	}
	public void setProductlist(List<product> productlist) {
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
		 items = new ArrayList<>();
	        items.add("Item 1");
	        items.add("Item 2");
	        items.add("Item 3");
	}
	public List<String> getItems() {
		return items;
	}
	
	public static class product{
		public String tensp;
		public String tinhtranghang;
		public Integer productID;
		public product() {
			
		}
		public product (String tensp, String tinhtranghang, Integer productid) {
			this.tensp = tensp;
			this.tinhtranghang = tinhtranghang;
			this.productID = productid;
		}
		public String getTensp() {
			return tensp;
		}
		public String getTinhtranghang() {
			return tinhtranghang;
		}
		public Integer getProductID() {
			return productID;
		}
		
		
		
	}
	@Init
    public void init() {
		product sanpham1 = new product("mu","conhang",1);
		product sanpham2 = new product("ao","conhang",2);
		product sanpham3 = new product("quan","hethang",3);
		productlist = new ArrayList<>();
		productlist.add(sanpham3);
		productlist.add(sanpham1);
		productlist.add(sanpham2);
		productlist.add(sanpham2);
		productlist.add(sanpham2);
		productlist.add(sanpham2);
		productlist.add(sanpham2);
		productlist.add(sanpham2);
		//setProductlist(productlist);
    }
}
