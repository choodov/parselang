package com.parselang.entity;

import javax.persistence.*;

@Entity(name = "WORD")
@Table(name = "words")
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "words_seq_gen")
    @SequenceGenerator(name = "words_seq_gen", sequenceName = "WORDS_SEQ")
    private long id;

    @Column(name = "word")
    private String word;

    @Column(name = "count")
    private long count;

    @ManyToOne
    @JoinColumn(name = "source_id")
    private Source source;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }
}