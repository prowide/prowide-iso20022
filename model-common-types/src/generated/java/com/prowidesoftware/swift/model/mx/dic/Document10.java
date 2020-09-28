
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about a document.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document10", propOrder = {
    "docTp",
    "presntnChanl",
    "docFrmt",
    "cpyInd",
    "sgndInd"
})
public class Document10 {

    @XmlElement(name = "DocTp", required = true)
    protected UndertakingDocumentType2Choice docTp;
    @XmlElement(name = "PresntnChanl")
    protected Channel1Choice presntnChanl;
    @XmlElement(name = "DocFrmt")
    protected DocumentFormat1Choice docFrmt;
    @XmlElement(name = "CpyInd")
    protected Boolean cpyInd;
    @XmlElement(name = "SgndInd")
    protected Boolean sgndInd;

    /**
     * Gets the value of the docTp property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingDocumentType2Choice }
     *     
     */
    public UndertakingDocumentType2Choice getDocTp() {
        return docTp;
    }

    /**
     * Sets the value of the docTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingDocumentType2Choice }
     *     
     */
    public Document10 setDocTp(UndertakingDocumentType2Choice value) {
        this.docTp = value;
        return this;
    }

    /**
     * Gets the value of the presntnChanl property.
     * 
     * @return
     *     possible object is
     *     {@link Channel1Choice }
     *     
     */
    public Channel1Choice getPresntnChanl() {
        return presntnChanl;
    }

    /**
     * Sets the value of the presntnChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Channel1Choice }
     *     
     */
    public Document10 setPresntnChanl(Channel1Choice value) {
        this.presntnChanl = value;
        return this;
    }

    /**
     * Gets the value of the docFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentFormat1Choice }
     *     
     */
    public DocumentFormat1Choice getDocFrmt() {
        return docFrmt;
    }

    /**
     * Sets the value of the docFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentFormat1Choice }
     *     
     */
    public Document10 setDocFrmt(DocumentFormat1Choice value) {
        this.docFrmt = value;
        return this;
    }

    /**
     * Gets the value of the cpyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCpyInd() {
        return cpyInd;
    }

    /**
     * Sets the value of the cpyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Document10 setCpyInd(Boolean value) {
        this.cpyInd = value;
        return this;
    }

    /**
     * Gets the value of the sgndInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSgndInd() {
        return sgndInd;
    }

    /**
     * Sets the value of the sgndInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Document10 setSgndInd(Boolean value) {
        this.sgndInd = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
