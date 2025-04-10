
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
 * Further information on the status reason of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusReasonInformation1", propOrder = {
    "stsOrgtr",
    "stsRsn",
    "addtlStsRsnInf"
})
public class StatusReasonInformation1 {

    @XmlElement(name = "StsOrgtr")
    protected PartyIdentification8 stsOrgtr;
    @XmlElement(name = "StsRsn")
    protected StatusReason1Choice stsRsn;
    @XmlElement(name = "AddtlStsRsnInf")
    protected List<String> addtlStsRsnInf;

    /**
     * Gets the value of the stsOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8 }
     *     
     */
    public PartyIdentification8 getStsOrgtr() {
        return stsOrgtr;
    }

    /**
     * Sets the value of the stsOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8 }
     *     
     */
    public StatusReasonInformation1 setStsOrgtr(PartyIdentification8 value) {
        this.stsOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReason1Choice }
     *     
     */
    public StatusReason1Choice getStsRsn() {
        return stsRsn;
    }

    /**
     * Sets the value of the stsRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReason1Choice }
     *     
     */
    public StatusReasonInformation1 setStsRsn(StatusReason1Choice value) {
        this.stsRsn = value;
        return this;
    }

    /**
     * Gets the value of the addtlStsRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlStsRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlStsRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlStsRsnInf property.
     */
    public List<String> getAddtlStsRsnInf() {
        if (addtlStsRsnInf == null) {
            addtlStsRsnInf = new ArrayList<>();
        }
        return this.addtlStsRsnInf;
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
     * Adds a new item to the addtlStsRsnInf list.
     * @see #getAddtlStsRsnInf()
     * 
     */
    public StatusReasonInformation1 addAddtlStsRsnInf(String addtlStsRsnInf) {
        getAddtlStsRsnInf().add(addtlStsRsnInf);
        return this;
    }

}
