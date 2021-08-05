package com.steria.ODFileAccess;
import com.azure.identity.AuthorizationCodeCredential;
import com.azure.identity.AuthorizationCodeCredentialBuilder;
import com.microsoft.graph.authentication.TokenCredentialAuthProvider;
import com.microsoft.graph.models.User;
import com.microsoft.graph.requests.GraphServiceClient;

public class access {
	private String clientId = "e19632e5-c77d-45d5-ba83-86e7a19287c9";

	//private String clientSecret;

	private String authorizationCode="";

	//private String redirectUri = "http//:localhost:8080/";
	
	//private String scopes = "https://graph.microsoft.com/.default";

	final AuthorizationCodeCredential authCodeCredential = new AuthorizationCodeCredentialBuilder()
	        .clientId(clientId)
	        //.clientSecret(clientSecret) //required for web apps, do not set for native apps
	        .authorizationCode(authorizationCode)
	        //.redirectUrl(redirectUri)
	        .build();

	final TokenCredentialAuthProvider tokenCredentialAuthProvider = new TokenCredentialAuthProvider(authCodeCredential);

	@SuppressWarnings("rawtypes")
	GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( tokenCredentialAuthProvider ).buildClient();

	User user = graphClient.me()
		.buildRequest()
		.get();
	//703a0ba9-a4b1-44a1-b137-7bec88ff1f97
	
	
	
//	https://login.microsoftonline.com/common/oauth2/v2.0/authorize?client_id=e19632e5-c77d-45d5-ba83-86e7a19287c9&response_type=code&redirect_uri=http%3A%2F%2Flocalhost%2Fmyapp%2F&response_mode=query&scope=openid%20offline_access%20https%3A%2F%2Fgraph.microsoft.com%2Fmail.read&state=12345
}
