import java.beans.XMLDecoder;
import java.io.InputStream;


public class XmlDecodeUtil {
	public static Object handleXml(InputStream in)
	{
	
		
		XMLDecoder d = new XMLDecoder(in);
		try{
			Object result = d.readObject();
			return result;
		}
		finally{
			d.close();
		}
	}

}
