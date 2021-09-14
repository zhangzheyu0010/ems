<template>
  <div>
    <table border="2">
      <tr>
        <td>ID</td>
        <td>name</td>
        <td>age</td>
        <td>bir</td>
        <td>address</td>
        <td>操作</td>
      </tr>
      <tr v-for="emp in emps" :key="emp.id">
        <td>{{emp.id}}</td>
        <td>{{emp.name}}</td>
        <td>{{emp.age}}</td>
        <td>{{emp.bir}}</td>
        <td>{{emp.address}}</td>
        <td><router-link :to="`/update/${emp.id}`">修改</router-link>|<a href="javascript:;" @click="delEmp(emp.id)">删除</a></td>
      </tr>
    </table>
    <button @click="out">安全退出</button>
  </div>
</template>

<script>
export default {
  name: "Emp",
  data(){
   return{
     emps:[]
   }
  },
  methods:{
    queryAll(){
      this.$axios.get("http://localhost:8989/zhangzy_emp_api/emp/queryall").then(res=>{
        console.log(res.data);
        this.emps=res.data
      }).catch(error=>{
        console.log(error)
      })
    },
    delEmp(id){
      this.$axios.get("http://localhost:8989/zhangzy_emp_api/emp/delemp?id="+id).then(res=>{
        console.log(res.data)
        this.emps=res.data
        this.queryAll()
      })
    },
    out(){
      localStorage.clear()
      this.$router.push("/login")
    }
  },
  created() {
    this.queryAll()
  }
}
</script>

<style scoped>

</style>
