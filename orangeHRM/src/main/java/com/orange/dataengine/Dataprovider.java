/*
 * package com.orange.dataengine;
 * 
 * import java.io.File; import java.lang.reflect.Method; import java.util.List;
 * 
 * import org.apache.log4j.Logger; import org.testng.annotations.DataProvider;
 * 
 * import com.poiji.bind.Poiji; import com.totumrisk.constants.FilePaths;
 * 
 * 
 * public class Dataprovider { private static int lB=0; private static int uB=0;
 * private static String path; private static String range = "null"; private
 * static Logger logger=Logger.getLogger(Dataprovider.class);
 * 
 * @SuppressWarnings({ "unchecked", "rawtypes" })
 * 
 * @DataProvider(name="testData") public Object[] data(Method obj){
 * DataProviderFactory dataFactoryObject =
 * obj.getAnnotation(DataProviderFactory.class); path = FilePaths.TESTDATA_FILE+
 * File.separator+dataFactoryObject.fileName(); range =
 * dataFactoryObject.range(); List<Class> dataSheetObj = Poiji.fromExcel(new
 * File(path),className(dataFactoryObject.sheetName()));
 * if(range.equals("null")) { uB = dataSheetObj.size();
 * 
 * } else if (!range.contains("-")) { uB=Integer.parseInt(range); } else {
 * String[] splitedString= range.split("-");
 * lB=Integer.parseInt(splitedString[0]); uB=Integer.parseInt(splitedString[1]);
 * }
 * 
 * Object[]dataArray= new Object[uB-lB]; int j=0; for (int i=lB;i<uB;i++){
 * dataArray[j]=dataSheetObj.get(i); j=j+1; }
 * 
 * return dataArray; }
 * 
 * @SuppressWarnings("rawtypes") private Class className(String sheet) { Class
 * className = null; String classPath = "com.totumrisk.dataengine."+sheet;
 * 
 * try { className = Class.forName(classPath); } catch (ClassNotFoundException
 * e) { logger.error("Invalid class"); e.printStackTrace(); } return className;
 * } }
 */