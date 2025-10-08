
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Groups the vote and the voting party information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VotingPartyAndInstruction", propOrder = {
    "id",
    "reqdExctnDt",
    "prsnDtl",
    "qtyOfScty",
    "votePerRsltn",
    "attndncCardLbllg"
})
public class VotingPartyAndInstruction {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "ReqdExctnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reqdExctnDt;
    @XmlElement(name = "PrsnDtl", required = true)
    protected IndividualPerson7 prsnDtl;
    @XmlElement(name = "QtyOfScty")
    protected BigDecimal qtyOfScty;
    @XmlElement(name = "VotePerRsltn")
    protected VoteChoice votePerRsltn;
    @XmlElement(name = "AttndncCardLbllg")
    protected String attndncCardLbllg;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VotingPartyAndInstruction setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VotingPartyAndInstruction setReqdExctnDt(XMLGregorianCalendar value) {
        this.reqdExctnDt = value;
        return this;
    }

    /**
     * Gets the value of the prsnDtl property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson7 }
     *     
     */
    public IndividualPerson7 getPrsnDtl() {
        return prsnDtl;
    }

    /**
     * Sets the value of the prsnDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson7 }
     *     
     */
    public VotingPartyAndInstruction setPrsnDtl(IndividualPerson7 value) {
        this.prsnDtl = value;
        return this;
    }

    /**
     * Gets the value of the qtyOfScty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyOfScty() {
        return qtyOfScty;
    }

    /**
     * Sets the value of the qtyOfScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public VotingPartyAndInstruction setQtyOfScty(BigDecimal value) {
        this.qtyOfScty = value;
        return this;
    }

    /**
     * Gets the value of the votePerRsltn property.
     * 
     * @return
     *     possible object is
     *     {@link VoteChoice }
     *     
     */
    public VoteChoice getVotePerRsltn() {
        return votePerRsltn;
    }

    /**
     * Sets the value of the votePerRsltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteChoice }
     *     
     */
    public VotingPartyAndInstruction setVotePerRsltn(VoteChoice value) {
        this.votePerRsltn = value;
        return this;
    }

    /**
     * Gets the value of the attndncCardLbllg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttndncCardLbllg() {
        return attndncCardLbllg;
    }

    /**
     * Sets the value of the attndncCardLbllg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VotingPartyAndInstruction setAttndncCardLbllg(String value) {
        this.attndncCardLbllg = value;
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
