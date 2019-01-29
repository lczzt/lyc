function getPath() {
    var pathName = document.location.pathname;
    var index = pathName.substr(1).indexOf("/");
    var path = pathName.substr(0,index+1);
    return path;
}