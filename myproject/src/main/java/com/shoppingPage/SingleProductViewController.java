package com.shoppingPage;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.metainfo.ComponentInfo;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zul.Window;

public class SingleProductViewController extends SelectorComposer<Window> {
	@Override
	public ComponentInfo doBeforeCompose(Page page, Component parent, ComponentInfo compInfo) {
		// TODO Auto-generated method stub
		return super.doBeforeCompose(page, parent, compInfo);
	}
	@Override
	public void doAfterCompose(Window comp) throws Exception {
		// TODO Auto-generated method stub
		super.doAfterCompose(comp);
		String productId = Executions.getCurrent().getParameter("id");
	}
}
