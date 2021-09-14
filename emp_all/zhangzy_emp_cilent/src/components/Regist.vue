<template>
  <div>
   用户名： <input type="text" v-model="username">
    密码：<input type="text" v-model="password">
    <button @click="addUser">注册</button>
  </div>
</template>

<script>
export default {
  name: "regist",
  data(){
    return{
      username:"",
      password:"",
    }
  },methods:{
    addUser(){
      if(this.username===""||this.password===""){
        alert("注册失败")
      }else {
        this.$axios({
        url:"http://localhost:8989/zhangzy_emp_api/user/adduser",
        method:"post",
        data:{
          username:this.username,
          password:this.password,
        }
      }).then(res=>{
        alert("注册成功")
          this.$router.push("/login")
        })
      }
    }
  }
}
</script>

<style scoped>

</style>
