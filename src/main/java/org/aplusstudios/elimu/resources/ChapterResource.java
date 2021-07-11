package org.aplusstudios.elimu.resources;

/**
 * DTO - Chapter entity resource DTO
 * Clients will have but one chapter interface - this -
 */
public record ChapterResource(String title,String highlight,long topicsCount){
}
