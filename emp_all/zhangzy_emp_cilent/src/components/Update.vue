<template>
  <div>
    姓名：<input type="text" v-model="name">
    年龄：<input type="text" v-model="age">
    生日：<input type="text" v-model="bir">
    地址：<input type="text" v-model="address">
    <button @click="updateEmp">修改用户</button>
  </div>
</template>

<script>

export default {
  name: "Update",
  data(){
    return{
      name:"",
      age:"",
      bir:"",
      address:"",
    }
  },methods:{
    queryOne(id){
      this.$axios.get("http://localhost:8989/zhangzy_emp_api/emp/queryone?id="+id).then(res=>{
        this.name=res.data.name
        this.age=res.data.age
        this.bir=res.data.bir
        this.address=res.data.address
      }).catch(error=>{
        console.log("查询失败");
      })
    },
    updateEmp(){
      this.$axios({
        url:"http://localhost:8989/zhangzy_emp_api/emp/update",
        method:"post",
        data:{
          id:this.$route.params.id,
          name: this.name,
          age: this.age,
          bir: this.bir,
          address: this.address,
        }
      }).then(res=>{
        console.log(res.data)
        this.name=res.data.name
        this.age=res.data.age
        this.bir=res.data.bir
        this.address=res.data.address
        this.$router.push("/emp")
      }).catch(error=>{
        console.log("错误")
      })
    }
  },created() {
    let id = this.$route.params.id;
    this.queryOne(id)

  }
}
</script>

<style scoped>

</style>
