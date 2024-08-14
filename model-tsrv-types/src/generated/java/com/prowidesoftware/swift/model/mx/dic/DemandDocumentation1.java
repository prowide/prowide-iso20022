
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Document presented for examination.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DemandDocumentation1", propOrder = {
    "cmpltInd",
    "cmpltnInf",
    "nclsdFile",
    "dmndNrrtv"
})
public class DemandDocumentation1 {

    @XmlElement(name = "CmpltInd")
    protected boolean cmpltInd;
    @XmlElement(name = "CmpltnInf")
    protected String cmpltnInf;
    @XmlElement(name = "NclsdFile")
    protected List<Document9> nclsdFile;
    @XmlElement(name = "DmndNrrtv")
    protected String dmndNrrtv;

    /**
     * Gets the value of the cmpltInd property.
     * 
     */
    public boolean isCmpltInd() {
        return cmpltInd;
    }

    /**
     * Sets the value of the cmpltInd property.
     * 
     */
    public DemandDocumentation1 setCmpltInd(boolean value) {
        this.cmpltInd = value;
        return this;
    }

    /**
     * Gets the value of the cmpltnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmpltnInf() {
        return cmpltnInf;
    }

    /**
     * Sets the value of the cmpltnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DemandDocumentation1 setCmpltnInf(String value) {
        this.cmpltnInf = value;
        return this;
    }

    /**
     * Gets the value of the nclsdFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nclsdFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNclsdFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document9 }
     * 
     * 
     * @return
     *     The value of the nclsdFile property.
     */
    public List<Document9> getNclsdFile() {
        if (nclsdFile == null) {
            nclsdFile = new ArrayList<>();
        }
        return this.nclsdFile;
    }

    /**
     * Gets the value of the dmndNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmndNrrtv() {
        return dmndNrrtv;
    }

    /**
     * Sets the value of the dmndNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DemandDocumentation1 setDmndNrrtv(String value) {
        this.dmndNrrtv = value;
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

    /**
     * Adds a new item to the nclsdFile list.
     * @see #getNclsdFile()
     * 
     */
    public DemandDocumentation1 addNclsdFile(Document9 nclsdFile) {
        getNclsdFile().add(nclsdFile);
        return this;
    }

}
