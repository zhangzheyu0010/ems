<template>
  <div>
    姓名：<input type="text" v-model="name">
    年龄：<input type="text" v-model="age">
    生日：<input type="text" v-model="bir">
    地址：<input type="text" v-model="address">
    <button @click="addEmp">添加用户</button>
  </div>
</template>

<script>
export default {
  name: "add",
  data(){
    return{
      name:"",
      age:"",
      bir:"",
      address:"",
      emp:{},
    }
  },
  methods:{
    addEmp(){
      this.$axios({
        url:"http://localhost:8989/zhangzy_emp_api/emp/addemp",
        method:"post",
        data:{
          name: this.name,
          age: this.age,
          bir: this.bir,
          address: this.address,
        }
      }).then(res=>{
        console.log("添加成功");
        this.$router.push("/emp")
      }).catch(error=>{
        console.log("添加失败")
      })
    }
  }
}
</script>

<style scoped>

</style>
