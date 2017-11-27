package com.parselang.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "SOURCE")
@Table(name = "sources")
public class Source {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sources_seq_gen")
    @SequenceGenerator(name = "sources_seq_gen", sequenceName = "SOURCES_SEQ")
    private long source_id;

    @Column(name = "name")
    private String name;

    @Column(name = "content")
    private String content;

    @OneToMany(mappedBy = "source", cascade = CascadeType.ALL)
    private List<Word> words;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getSource_id() {
        return source_id;
    }

    public void setSource_id(long source_id) {
        this.source_id = source_id;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }
}
