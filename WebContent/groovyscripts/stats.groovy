html.h1("Disk Free (df -h)")
html.pre('df -h'.execute().text)
html.hr()
html.h1("IP Config ('ifconfig')")
html.pre('ifconfig'.execute().text)
//html.hr()
//html.h1("Top (top -n 1)")
//def topCommand = ["sh", "-c", "top -n 1"].execute()
//topCommand.waitFor()
//topOutput = topCommand.text
//println "Top Output Results: "
//html.pre(topOutput)
html.hr()
html.h1("System Properties")
System.properties.each{html.p(it)}
html.hr()
html.h1("Environment Variables")
System.env.each{html.p(it)}
