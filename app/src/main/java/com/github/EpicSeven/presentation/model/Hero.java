package com.github.EpicSeven.presentation.model;import com.github.EpicSeven.R;public class Hero {/*    //display of the list    private String id;    private String name;    private String type;    //display of the details    private String title;    private String hint;    private String story;    private String poise;    private String difficulty;    private String stats;    private String talents;    private String skills;    private String history;    public String getId() {        return id;    }    public void setId(String id) {        this.id = id;    }    public String getName() {        return name;    }    public void setName(String name) {        this.name = name;    }    public String getType() {        return type;    }    public void setType(String type) {        this.type = type;    }    public String getHint() {        return hint;    }    public void setHint(String hint) {        this.hint = hint;    }    public String getStory() {        return story;    }    public void setStory(String story) {        this.story = story;    }    public String getPoise() {        return poise;    }    public void setPoise(String poise) {        this.poise = poise;    }    public String getDifficulty() {        return difficulty;    }    public void setDifficulty(String difficulty) {        this.difficulty = difficulty;    }    public String getStats() {        return stats;    }    public void setStats(String stats) {        this.stats = stats;    }    public String getTalents() {        return talents;    }    public void setTalents(String talents) {        this.talents = talents;    }    public String getSkills() {        return skills;    }    public void setSkills(String skills) {        this.skills = skills;    }    public String getHistory() {        return history;    }    public void setHistory(String history) {        this.history = history;    }    public String getTitle() {        return title;    }    public void setTitle(String title) {        this.title = title;    } */    private String _id;    private String name;    private String role;    public Hero(String id, String name, String role) {        this._id = id;        this.name = name;        this.role = role;    }    public String getName() {        return name;    }    public void setName(String name) {        this.name = name;    }    public String getId() {        return _id;    }    public void setId(String id) {        this._id = id;    }    public String getRole() {        return role;    }    public void setRole(String role) {        this.role = role;    }}