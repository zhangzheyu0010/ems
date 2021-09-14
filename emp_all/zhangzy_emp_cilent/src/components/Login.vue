<template>
  <div>
    <input type="text" v-model="username">
    <input type="text" v-model="password">
    <button @click="loginUser">登录</button>
    <button @click="regist">注册</button>
  </div>
</template>

<script>
export default {
  name: "Login",
  data(){
    return{
      username:"",
      password:""
    }
  },methods:{
    loginUser(){
      this.$axios({
        url:"http://localhost:8989/zhangzy_emp_api/user/queryuser",
        method:"post",
        data:{
          username:this.username,
          password:this.password,
        }
      }).then(res=>{
        if(res.data===1){
          localStorage.user=JSON.stringify({username:this.username,password:this.password})
          this.$router.push("/emp")}
        else if (res.data===2){alert("账号错误")}
        else {alert("密码错误")}
      }).catch(error=>{
        console.log(error)
      })
    },
    regist(){
      this.$router.push("/regist")
    }
  }
}
</script>

<style scoped>

</style>
