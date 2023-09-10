package com.app.inner;

import java.util.HashMap;
import java.util.Map;

public class MainClass {
	private Map<String, Tenant> tenants = new HashMap<>();
	  private Map<String, System> systems = new HashMap<>();
	
	static class Tenant
	{
		private String consumerKey;
	    private String signatureMethod;
	    private String whitelist;
	    private String signature;
	    private String url;
		public String getConsumerKey() {
			return consumerKey;
		}
		public void setConsumerKey(String consumerKey) {
			this.consumerKey = consumerKey;
		}
		public String getSignatureMethod() {
			return signatureMethod;
		}
		public void setSignatureMethod(String signatureMethod) {
			this.signatureMethod = signatureMethod;
		}
		public String getWhitelist() {
			return whitelist;
		}
		public void setWhitelist(String whitelist) {
			this.whitelist = whitelist;
		}
		public String getSignature() {
			return signature;
		}
		public void setSignature(String signature) {
			this.signature = signature;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	    
	}
	
	static class  System
	{
		  private String consumerKey;
		    private String signatureMethod;
		    private String signature;
		    private String url;
			public String getConsumerKey() {
				return consumerKey;
			}
			public void setConsumerKey(String consumerKey) {
				this.consumerKey = consumerKey;
			}
			public String getSignatureMethod() {
				return signatureMethod;
			}
			public void setSignatureMethod(String signatureMethod) {
				this.signatureMethod = signatureMethod;
			}
			public String getSignature() {
				return signature;
			}
			public void setSignature(String signature) {
				this.signature = signature;
			}
			public String getUrl() {
				return url;
			}
			public void setUrl(String url) {
				this.url = url;
			}
		    
	}

	public static void main(String[] args) {
		MainClass.Tenant t =new MainClass.Tenant();
		t.setConsumerKey("a");
		t.setSignature("s");
		t.setSignatureMethod("sm");
		t.setUrl("http");
		t.setWhitelist("abc");
		MainClass.Tenant t1 =new MainClass.Tenant();
		t.setConsumerKey("a");
		t.setSignature("s");
		t.setSignatureMethod("sm");
		t.setUrl("http");
		t.setWhitelist("abc");
		MainClass.Tenant t3 =new MainClass.Tenant();
		t.setConsumerKey("a");
		t.setSignature("s");
		t.setSignatureMethod("sm");
		t.setUrl("http");
		t.setWhitelist("abc");
		MainClass m=new MainClass();
		m.tenants.put("abc", t);
		m.tenants.put("mln", t1);
		m.tenants.put("poi", t3);
		
		
		
		

	}

}
