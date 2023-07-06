package com.shoppingPage;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.metainfo.ComponentInfo;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Div;
import org.zkoss.zul.Image;

import com.tableData.Product;
import com.tableDao.ProductDAO;

public class SingleProductViewController extends SelectorComposer<Div> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Wire
	private Image productImg;
	@Override
	public ComponentInfo doBeforeCompose(Page page, Component parent, ComponentInfo compInfo) {
		// TODO Auto-generated method stub
		return super.doBeforeCompose(page, parent, compInfo);
	}
	@Override
	public void doAfterCompose(Div comp) throws Exception {
		// TODO Auto-generated method stub
		super.doAfterCompose(comp);
		String productId = Executions.getCurrent().getParameter("id");
		Product singleP =new Product();
		ProductDAO singlePDao = new ProductDAO();
		singleP = singlePDao.getProductbyProductID(productId);
		
		///UI
		productImg.setSrc(singleP.getImagePath());
		productImg.setStyle("width:600px;height:600px");
	}
}
