
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
 * Further information on the reversal reason of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReversalReasonInformation1", propOrder = {
    "rvslOrgtr",
    "rvslRsn",
    "addtlRvslRsnInf"
})
public class ReversalReasonInformation1 {

    @XmlElement(name = "RvslOrgtr")
    protected PartyIdentification8 rvslOrgtr;
    @XmlElement(name = "RvslRsn")
    protected ReversalReason1Choice rvslRsn;
    @XmlElement(name = "AddtlRvslRsnInf")
    protected List<String> addtlRvslRsnInf;

    /**
     * Gets the value of the rvslOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8 }
     *     
     */
    public PartyIdentification8 getRvslOrgtr() {
        return rvslOrgtr;
    }

    /**
     * Sets the value of the rvslOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8 }
     *     
     */
    public ReversalReasonInformation1 setRvslOrgtr(PartyIdentification8 value) {
        this.rvslOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the rvslRsn property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalReason1Choice }
     *     
     */
    public ReversalReason1Choice getRvslRsn() {
        return rvslRsn;
    }

    /**
     * Sets the value of the rvslRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalReason1Choice }
     *     
     */
    public ReversalReasonInformation1 setRvslRsn(ReversalReason1Choice value) {
        this.rvslRsn = value;
        return this;
    }

    /**
     * Gets the value of the addtlRvslRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlRvslRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlRvslRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlRvslRsnInf() {
        if (addtlRvslRsnInf == null) {
            addtlRvslRsnInf = new ArrayList<String>();
        }
        return this.addtlRvslRsnInf;
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
     * Adds a new item to the addtlRvslRsnInf list.
     * @see #getAddtlRvslRsnInf()
     * 
     */
    public ReversalReasonInformation1 addAddtlRvslRsnInf(String addtlRvslRsnInf) {
        getAddtlRvslRsnInf().add(addtlRvslRsnInf);
        return this;
    }

}
