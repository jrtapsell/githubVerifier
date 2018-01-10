object Controller {
    fun start() {
        netlify.default(NetlifyArguments()).authenticate(AuthArguments("github", "user")) { err, data ->
            console.log(err)
            console.log(data)
        }
    }
}