
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Set of elements used to identify the documents referred to in the remittance information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferredDocumentInformation8", propOrder = {
    "tp",
    "nb",
    "rltdDt",
    "lineDtls"
})
public class ReferredDocumentInformation8 {

    @XmlElement(name = "Tp")
    protected DocumentType1 tp;
    @XmlElement(name = "Nb")
    protected String nb;
    @XmlElement(name = "RltdDt")
    protected DateAndType1 rltdDt;
    @XmlElement(name = "LineDtls")
    protected List<DocumentLineInformation2> lineDtls;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType1 }
     *     
     */
    public DocumentType1 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType1 }
     *     
     */
    public ReferredDocumentInformation8 setTp(DocumentType1 value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the nb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNb() {
        return nb;
    }

    /**
     * Sets the value of the nb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReferredDocumentInformation8 setNb(String value) {
        this.nb = value;
        return this;
    }

    /**
     * Gets the value of the rltdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndType1 }
     *     
     */
    public DateAndType1 getRltdDt() {
        return rltdDt;
    }

    /**
     * Sets the value of the rltdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndType1 }
     *     
     */
    public ReferredDocumentInformation8 setRltdDt(DateAndType1 value) {
        this.rltdDt = value;
        return this;
    }

    /**
     * Gets the value of the lineDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentLineInformation2 }
     * 
     * 
     */
    public List<DocumentLineInformation2> getLineDtls() {
        if (lineDtls == null) {
            lineDtls = new ArrayList<DocumentLineInformation2>();
        }
        return this.lineDtls;
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
     * Adds a new item to the lineDtls list.
     * @see #getLineDtls()
     * 
     */
    public ReferredDocumentInformation8 addLineDtls(DocumentLineInformation2 lineDtls) {
        getLineDtls().add(lineDtls);
        return this;
    }

}
