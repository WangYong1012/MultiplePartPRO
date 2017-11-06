package cn.brave.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 2017年11月6日 11:14:37
 * 日期工具类
 * @author Administrator
 *
 */
public class DateTool
{
	
	private static SimpleDateFormat YYYY_MM_DD_HH_MM_SS = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	//年月日格式
	private static SimpleDateFormat YYYY_MM_DD_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
	private static SimpleDateFormat YYYYMMDD_FORMAT = new SimpleDateFormat("yyyyMMdd");
	//年月格式
	private static SimpleDateFormat YYYY_MM_FORMAT = new SimpleDateFormat("yyyy-MM");
	private static SimpleDateFormat YYYYMM_FORMAT = new SimpleDateFormat("yyyyMM");
	
	/**
	 * 2017年10月19日 10:20:03
	 * 获取年-月-日(yyyy-mm-dd)
	 * @return
	 */
	public static String getY_M_D()
	{
		Date date = new Date();
		return YYYY_MM_DD_FORMAT.format(date);
	}
	
	/**
	 * 2017年10月19日 10:20:07
	 * 获取年月日(yyyymmdd)
	 * @return
	 */
	public static String getYMD()
	{
		Date date = new Date();
		return YYYYMMDD_FORMAT.format(date);
	}
	
	/**
	 * 2017年10月19日 10:20:18
	 * 获取年-月(yyyy-mm)
	 * @return
	 */
	public static String getY_M()
	{
		Date date = new Date();
		return YYYY_MM_FORMAT.format(date);
	}
	
	/**
	 * 2017年10月19日 10:20:28
	 * 获取年月(yyyymm)
	 * @return
	 */
	public static String getYM()
	{
		Date date = new Date();
		return YYYYMM_FORMAT.format(date);
	}
	
	/**
	 * 2017年10月19日 10:20:40
	 * 获取完整的日期-时间字符串
	 * @return
	 */
	public static String getHoleDate()
	{
		Date date = new Date();
		return YYYY_MM_DD_HH_MM_SS.format(date);
	}
	
	
}