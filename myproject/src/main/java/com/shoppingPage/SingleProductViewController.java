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
import com.tableData.ProductPicture;
import com.tableDao.ProductDAO;
import com.tableDao.ProductPictureDAO;

public class SingleProductViewController extends SelectorComposer<Div> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Wire
	private Image productImg,productImg1,productImg2,productImg3;
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
		ProductPicture Pics = new ProductPicture();
		
		singleP = new ProductDAO().getProductbyProductID(productId);
		Pics = new ProductPictureDAO().getProducPicturebyProductID(productId);
		///UI
		productImg.setSrc(singleP.getImagePath());
		productImg.setStyle("width:600px;height:600px");
		productImg1.setSrc(Pics.getURL1());
		productImg1.setStyle("width:600px;height:600px");
		productImg2.setSrc(Pics.getURL2());
		productImg2.setStyle("width:600px;height:600px");
		productImg3.setSrc(Pics.getURL3());
		productImg3.setStyle("width:600px;height:600px");
	}
}
