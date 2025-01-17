document.getElementById("add-task").addEventListener("click", function () {
    const taskInput = document.getElementById("new-task");
    const taskText = taskInput.value.trim();

    if (taskText) {
        const taskList = document.getElementById("task-list");
        const taskItem = document.createElement("li");

        taskItem.innerHTML = `${taskText} <button class="delete-task">X</button>`;
        taskList.appendChild(taskItem);

        // Efface l'entrée
        taskInput.value = "";

        // Ajoute un événement pour supprimer la tâche
        taskItem.querySelector(".delete-task").addEventListener("click", function () {
            taskItem.remove();
        });
    }
});
