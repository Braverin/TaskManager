/*
任务类，存储任务的基本信息(eg:任务名称、描述、状态)
 */
package com.taskmanager;

public class Task {
    private  int Id ;
    private String name;  // 任务名称
    private String description; // 任务描述
    private boolean completed; // 任务是否完成
    private int priority;  // 任务优先级

    /**
     * 构造函数，用于创建一个具有指定名称、描述和优先级的任务。
     * 任务的初始状态设置为未完成。
     *
     * @param name 任务的名称
     * @param description 任务的描述
     * @param priority 任务的优先级
     */
    public Task(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.completed = false;
        this.priority = priority;
        this.Id = 0;
    }

    /**
     * 构造函数，用于创建一个具有指定名称和描述的任务。
     * 任务的初始状态设置为未完成，优先级默认设置为1。
     *
     * @param name 任务的名称
     * @param description 任务的描述
     */
    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.completed = false;
        this.priority = 1;
        this.Id = 0;
    }

    /**
     * 构造函数，用于创建一个仅具有指定名称的任务。
     * 任务的描述默认设置为空字符串，初始状态设置为未完成，优先级默认设置为1。
     *
     * @param name 任务的名称
     */
    public Task(String name){
        this.name = name;
        this.description = "";
        this.completed = false;
        this.priority = 1;
        this.Id = 0;
    }


    /**
     * 构造函数，用于创建一个具有指定名称和优先级的任务。
     * 任务的描述默认设置为空字符串，初始状态设置为未完成。
     *
     * @param name 任务的名称
     * @param priority 任务的优先级
     */
    public Task(String name, int priority){
        this.name = name;
        this.description = "";
        this.completed = false;
        this.priority = priority;
        this.Id = 0;
    }

    /**
     * 获取任务的ID
     * @return Id 任务的ID
     */
    public int getId() {
        return Id;
    }

    /**
     * 设置任务的ID
     * @param id 任务的新ID
     */
    public void setId(int id) {
        this.Id = id;
    }
    /**
     * 获取任务的名称。
     *
     * @return name 任务的名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置任务的名称。
     *
     * @param name 任务的新名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取任务的描述。
     *
     * @return description 任务的描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置任务的描述。
     *
     * @param description 任务的新描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取任务的完成状态。
     * @return completed 任务是否完成
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * 设置任务的完成状态。
     * @param completed 任务的新完成状态
     */
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    /**
     *  获取任务的优先级
     * @return priority 任务的优先级
     */
    public int getPriority() {
        return priority;
    }

    /**
     * 设置任务的优先级
     * @param priority 任务的新优先级
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }

}
