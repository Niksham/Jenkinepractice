/*
 * package com.orange.configuration.utilities;
 * 
 * import java.time.OffsetDateTime; import java.util.List; import
 * java.util.UUID; import java.util.concurrent.TimeUnit;
 * 
 * import org.apache.commons.lang3.StringUtils; import org.apache.log4j.Logger;
 * import org.bson.assertions.Assertions; import org.testng.Assert; import
 * com.mailslurp.apis.InboxControllerApi; import
 * com.mailslurp.apis.MailServerControllerApi; import
 * com.mailslurp.apis.WaitForControllerApi; import
 * com.mailslurp.clients.ApiClient; import com.mailslurp.clients.ApiException;
 * import com.mailslurp.clients.Configuration; import
 * com.mailslurp.models.Email; import
 * com.mailslurp.models.EmailVerificationResult; import
 * com.mailslurp.models.Inbox; import
 * com.mailslurp.models.VerifyEmailAddressOptions;
 * 
 * import okhttp3.OkHttpClient;
 * 
 * public class MailslurpAccount {
 * 
 * private static ApiClient apiClient; private static final int TIMEOUT =
 * 180000; private static InboxControllerApi inboxControllerApi = null; private
 * static String apiKey =
 * "b12f3b69afb0088c225188c31f0ded61af5b3c0375cb1e014e7bc23fddf4c13e"; //private
 * static String apiKey
 * ="7fbdcab893058689c7e256f3c6f16a49041b46e553f5103fdf39c726302d2ab4";//Email:
 * vishh@getnada.com //private static String apiKey
 * ="9d24a20e7b2e73dfc7f918e71b99f84a0c74914ccb4bd523c14ac8f80e645f7c";//Email:
 * mailslurp@getnada.com private static Logger logger =
 * Logger.getLogger(MailslurpAccount.class); private static Boolean
 * ALLOW_TEAM_ACCESS = null; private static String DESCRIPTION = null; private
 * static String EMAIL_ADDRESS = null; private static OffsetDateTime EXPIRES_AT
 * = null; private static Long EXPIRE_IN = null; private static Boolean
 * FAVOURITE = null; private static String INBOX_TYPE = null; private static
 * String NAME = null; private static List<String> TAGS = null; private static
 * Boolean USE_DOMAIN_POOL = null; private Inbox inbox; private int startIndex =
 * 0; private int endIndex = 0; private int refIndex = 0;
 * 
 *//**
	 * 
	 * @throws Exception if API key not found, set API key in MAilslurpAccount
	 */
/*
 * public void mailslurpSetup() throws Exception {
 * 
 * // get API KEY for mailslurp from environment variable if
 * (StringUtils.isBlank(apiKey)) { throw new Exception("Must provide API KEY");
 * } logger.info("Preparing to establish HTTP connection"); // IMPORTANT set
 * timeout for the http client OkHttpClient httpClient = new
 * OkHttpClient.Builder() .connectTimeout(TIMEOUT, TimeUnit.MILLISECONDS)
 * .writeTimeout(TIMEOUT, TimeUnit.MILLISECONDS) .readTimeout(TIMEOUT,
 * TimeUnit.MILLISECONDS) .build(); logger.info("HTTP connection etablished");
 * 
 * apiClient = Configuration.getDefaultApiClient(); // IMPORTANT set api client
 * timeouts apiClient.setConnectTimeout(TIMEOUT);
 * apiClient.setWriteTimeout(TIMEOUT); apiClient.setReadTimeout(TIMEOUT); //
 * IMPORTANT set API KEY and client apiClient.setHttpClient(httpClient);
 * apiClient.setApiKey(apiKey); inboxControllerApi = new
 * InboxControllerApi(apiClient); }
 * 
 *//**
	 * Create a single Inbox
	 * 
	 * @return the INBOX object. Use the INBOX object to retreive InboxID, email
	 *         address etc.
	 */
/*
 * public Inbox createNewInbox() { try { mailslurpSetup(); inbox =
 * inboxControllerApi.createInbox(ALLOW_TEAM_ACCESS,DESCRIPTION, EMAIL_ADDRESS,
 * EXPIRES_AT, EXPIRE_IN, FAVOURITE, INBOX_TYPE, NAME, TAGS, USE_DOMAIN_POOL); }
 * catch (ApiException e) {
 * logger.debug("Failed to create inbox in MailSlurp=>"+e.getMessage());
 * logger.info("Status code=>"+ e.getCode()); e.printStackTrace(); } catch
 * (Exception e) { e.printStackTrace(); }
 * Assert.assertEquals(inbox.getEmailAddress().contains("@mailslurp.com"),
 * true); Assert.assertNotNull(inbox.getId());
 * logger.info("Newely created email=>"+inbox.getEmailAddress()); return inbox;
 * }
 * 
 *//**
	 * 
	 * @param ID inboxID as string
	 * @return the complete email body
	 *//*
		 * 
		 * public String getMsgBody(String ID) { try { mailslurpSetup(); } catch
		 * (Exception e) { e.printStackTrace(); } String msg = null; UUID inboxID =
		 * UUID.fromString(ID); try { inbox = inboxControllerApi.getInbox(inboxID);
		 * WaitForControllerApi waitForControllerApi = new
		 * WaitForControllerApi(apiClient); Email email =
		 * waitForControllerApi.waitForLatestEmail(null, null,inboxID, null, null,
		 * null,null ); msg = email.getBody(); } catch (ApiException e) {
		 * logger.debug("Failed to retreive Msg from inbox=>");
		 * logger.info("Status code=>"+ e.getCode()); e.printStackTrace(); } return msg;
		 * }
		 * 
		 * public String getSubject(String ID) { try { mailslurpSetup(); } catch
		 * (Exception e) { e.printStackTrace(); } String msg = null; UUID inboxID =
		 * UUID.fromString(ID); try { inbox = inboxControllerApi.getInbox(inboxID);
		 * WaitForControllerApi waitForControllerApi = new
		 * WaitForControllerApi(apiClient); Email email =
		 * waitForControllerApi.waitForLatestEmail(null, null,inboxID, null, null,
		 * null,null ); msg = email.getSubject(); } catch (ApiException e) {
		 * logger.debug("Failed to retreive Subject from inbox=>");
		 * logger.info("Status code=>"+ e.getCode()); e.printStackTrace(); } return msg;
		 * }
		 * 
		 * public String extractMailBody(String UUID) { try { mailslurpSetup(); } catch
		 * (Exception e) { e.printStackTrace(); } String recievedMail =
		 * getMsgBody(UUID); refIndex = recievedMail.indexOf("id=\"text-edit\"");
		 * startIndex = recievedMail.indexOf(">", refIndex)+1; endIndex =
		 * recievedMail.indexOf("<", refIndex); return
		 * recievedMail.substring(startIndex, endIndex); }
		 * 
		 * public String getLink(String UUID) { String recievedMail = null; try {
		 * mailslurpSetup(); recievedMail = getMsgBody(UUID); refIndex =
		 * recievedMail.indexOf("a href=\""); startIndex = recievedMail.indexOf("\"",
		 * refIndex)+1; endIndex = recievedMail.indexOf("\"", startIndex); } catch
		 * (Exception e) { e.printStackTrace(); } return
		 * recievedMail.substring(startIndex, endIndex); }
		 * 
		 * public String getResetPwdLink(String UUID) { String recievedMail = null; try
		 * { mailslurpSetup(); recievedMail = getMsgBody(UUID); refIndex =
		 * recievedMail.indexOf("href=\""); startIndex = recievedMail.indexOf("\"",
		 * refIndex)+1; endIndex = recievedMail.indexOf("\"", startIndex); } catch
		 * (Exception e) { e.printStackTrace(); } return
		 * recievedMail.substring(startIndex, endIndex); }
		 * 
		 * public String getSignature(String UUID) { String recievedMail = null; try {
		 * mailslurpSetup(); recievedMail = getMsgBody(UUID); String index =
		 * "id=\"signature-edit\" class=\"signature-text\">"; refIndex =
		 * recievedMail.indexOf(index); startIndex = recievedMail.indexOf(">",
		 * refIndex)+1; endIndex = recievedMail.indexOf("<", startIndex); } catch
		 * (Exception e) { e.printStackTrace(); } return
		 * recievedMail.substring(startIndex, endIndex); } }
		 */