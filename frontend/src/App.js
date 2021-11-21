import "./App.css";
import React, { useEffect } from "react";
import axios from "axios";

function App() {
  const baseUrl = "http://localhost:8080";

  async function getTodos() {
    await axios
      .get(baseUrl + "/todo")
      .then((response) => {
        console.log(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }

  useEffect(() => {
    getTodos();
  }, []);

  return <div className="App"></div>;
}

export default App;
