import Vue from 'vue'
import Router from 'vue-router'
import Emp from "../components/Emp";
import Add from "../components/Add";
import Update from "../components/Update";
import Login from "../components/Login";
import Regist from "../components/Regist";

Vue.use(Router)



export default new Router({
  routes: [
    {path:"/emp",name:"Emp",component:Emp},
    {path:"/add",name:"Add",component:Add},
    {path:"/update/:id",name:"Update",component:Update},
    {path:"/login",name:"Login",component:Login},
    {path:"/regist",name:"Regist",component:Regist},
    {path:"/",redirect:"/login"},
    {path:"/*",redirect:"/login"}
  ]
})
