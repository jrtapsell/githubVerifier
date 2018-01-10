/**
var authenticator = new netlify.default ({});
authenticator.authenticate({provider:"github", scope: "user"}, function(err, data) {
    if (err) {
        return $("#output").text("Error Authenticating with GitHub: " + err);
    }
    $("#output").text("Authenticated with GitHub. Access Token: " + data.token);
});
 */
class NetlifyArguments
data class AuthArguments(val provider: String, val scope: String)

external class AuthResult(token: String)

external class Authenticator {
    fun authenticate(auth: AuthArguments, block:(String?, AuthResult?)->Unit)
}

external val netlify: Netlify

external class Netlify {
    fun default(args: NetlifyArguments): Authenticator
}