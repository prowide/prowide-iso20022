
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
 * Content of the Diagnosis Request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosisRequest1", propOrder = {
    "hstDgnssFlg",
    "acqrrId"
})
public class DiagnosisRequest1 {

    @XmlElement(name = "HstDgnssFlg")
    protected Boolean hstDgnssFlg;
    @XmlElement(name = "AcqrrId")
    protected List<String> acqrrId;

    /**
     * Gets the value of the hstDgnssFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHstDgnssFlg() {
        return hstDgnssFlg;
    }

    /**
     * Sets the value of the hstDgnssFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public DiagnosisRequest1 setHstDgnssFlg(Boolean value) {
        this.hstDgnssFlg = value;
        return this;
    }

    /**
     * Gets the value of the acqrrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acqrrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcqrrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the acqrrId property.
     */
    public List<String> getAcqrrId() {
        if (acqrrId == null) {
            acqrrId = new ArrayList<>();
        }
        return this.acqrrId;
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
     * Adds a new item to the acqrrId list.
     * @see #getAcqrrId()
     * 
     */
    public DiagnosisRequest1 addAcqrrId(String acqrrId) {
        getAcqrrId().add(acqrrId);
        return this;
    }

}
