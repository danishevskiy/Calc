package com.calc;


import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * If you want to run this application without deploying, run the Start class.
 * 
 * @see com.calc.Start#main(String[])
 */
public class WicketApplication extends WebApplication
{
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends WebPage> getHomePage()
	{
		return Calc.class;
	}

	/**
	 * @see org.apache.wicket.Application#init()
	 */
	@Override
	public void init()
	{
		super.init();

	}
}
