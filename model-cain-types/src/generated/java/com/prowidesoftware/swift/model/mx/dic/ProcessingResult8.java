
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
 * Outcome of the processing of the authorisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingResult8", propOrder = {
    "rsltData",
    "addtlInf"
})
public class ProcessingResult8 {

    @XmlElement(name = "RsltData")
    protected ResultData1 rsltData;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation20> addtlInf;

    /**
     * Gets the value of the rsltData property.
     * 
     * @return
     *     possible object is
     *     {@link ResultData1 }
     *     
     */
    public ResultData1 getRsltData() {
        return rsltData;
    }

    /**
     * Sets the value of the rsltData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultData1 }
     *     
     */
    public ProcessingResult8 setRsltData(ResultData1 value) {
        this.rsltData = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation20 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation20> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
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
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public ProcessingResult8 addAddtlInf(AdditionalInformation20 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
