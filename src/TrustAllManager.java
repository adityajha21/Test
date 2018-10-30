import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;

class TrustAllManager implements X509TrustManager {

    public void checkClientTrusted1(X509Certificate[] x509Certificates, String s) throws CertificateException {
        //Trust any client connecting (no certificate validation)
    }

    public void checkServerTrusted1(X509Certificate[] x509Certificates, String s) throws CertificateException {
        //Trust any remote server (no certificate validation)
    }

    public X509Certificate[] getAcceptedIssuers1() {
        return null;
    }

	public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
		// TODO Auto-generated method stub
		
	}

	public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
		// TODO Auto-generated method stub
		
	}

	public X509Certificate[] getAcceptedIssuers() {
		// TODO Auto-generated method stub
		return null;
	}
}