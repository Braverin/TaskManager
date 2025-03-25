/*
管理任务类，包含添加、删除、修改、查询等任务管理功能。
 */
package com.taskmanager;

import java.util.List;

public class TaskManager {
    private List<Task> tasks; // 存储任务的列表

    /**
     * 添加一个任务到任务列表中
     *
     * @param task The task to be added, representing the task that needs to be executed
     */
    public void addTask(Task task) {
        // 添加任务到列表
        tasks.add(task);
    }

    /**
     * 删除一个任务从任务列表中
     *
     * @param taskId The ID of the task to be removed, representing the task that needs to be removed
     */
    public void removeTask(int taskId) {
        boolean find = false;
        // 删除任务从列表
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                tasks.remove(task);
                find = true;
                System.out.println("Task removed.");
                break;
            }
        }
        // 任务不存在
        if (!find) {
            System.out.println("Task not found");
        }
    }

    /**
     * 获取任务列表中的所有任务
     *
     * @return The list of tasks, representing the tasks that need to be executed
     */
    public List<Task> getAllTasks() {
        return tasks;
    }

    /**
     * 标记任务为完成
     *
     * @param taskId The ID of the task to be marked as completed, representing the task that needs to be marked as completed
     */
    public void markTaskAsCompleted(int taskId) {
        boolean find = false;
        // 标记任务为完成
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.setCompleted(true);
                find = true;
                System.out.println("Task marked as completed.");
                break;
            }
            // 任务已经完成
            if (task.isCompleted()) {
                System.out.println("Task is already completed.");
            }
        }
        // 任务不存在
        if (!find) {
            System.out.println("Task not found.");
        }
    }
}
