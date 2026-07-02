
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Information about a meeting vote instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Instruction4", propOrder = {
    "snglInstrId",
    "reqdExctnDt",
    "voteExctnConf",
    "acctDtls",
    "prxy",
    "voteDtls",
    "mtgAttndee",
    "spcfcInstrReq"
})
public class Instruction4 {

    @XmlElement(name = "SnglInstrId", required = true)
    protected String snglInstrId;
    @XmlElement(name = "ReqdExctnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reqdExctnDt;
    @XmlElement(name = "VoteExctnConf")
    protected boolean voteExctnConf;
    @XmlElement(name = "AcctDtls", required = true)
    protected SafekeepingAccount9 acctDtls;
    @XmlElement(name = "Prxy")
    protected Proxy7 prxy;
    @XmlElement(name = "VoteDtls")
    protected VoteDetails4 voteDtls;
    @XmlElement(name = "MtgAttndee")
    protected List<IndividualPerson39> mtgAttndee;
    @XmlElement(name = "SpcfcInstrReq")
    protected SpecificInstructionRequest2 spcfcInstrReq;

    /**
     * Gets the value of the snglInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnglInstrId() {
        return snglInstrId;
    }

    /**
     * Sets the value of the snglInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Instruction4 setSnglInstrId(String value) {
        this.snglInstrId = value;
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
    public Instruction4 setReqdExctnDt(XMLGregorianCalendar value) {
        this.reqdExctnDt = value;
        return this;
    }

    /**
     * Gets the value of the voteExctnConf property.
     * 
     */
    public boolean isVoteExctnConf() {
        return voteExctnConf;
    }

    /**
     * Sets the value of the voteExctnConf property.
     * 
     */
    public Instruction4 setVoteExctnConf(boolean value) {
        this.voteExctnConf = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingAccount9 }
     *     
     */
    public SafekeepingAccount9 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingAccount9 }
     *     
     */
    public Instruction4 setAcctDtls(SafekeepingAccount9 value) {
        this.acctDtls = value;
        return this;
    }

    /**
     * Gets the value of the prxy property.
     * 
     * @return
     *     possible object is
     *     {@link Proxy7 }
     *     
     */
    public Proxy7 getPrxy() {
        return prxy;
    }

    /**
     * Sets the value of the prxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proxy7 }
     *     
     */
    public Instruction4 setPrxy(Proxy7 value) {
        this.prxy = value;
        return this;
    }

    /**
     * Gets the value of the voteDtls property.
     * 
     * @return
     *     possible object is
     *     {@link VoteDetails4 }
     *     
     */
    public VoteDetails4 getVoteDtls() {
        return voteDtls;
    }

    /**
     * Sets the value of the voteDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteDetails4 }
     *     
     */
    public Instruction4 setVoteDtls(VoteDetails4 value) {
        this.voteDtls = value;
        return this;
    }

    /**
     * Gets the value of the mtgAttndee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mtgAttndee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMtgAttndee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualPerson39 }
     * 
     * 
     */
    public List<IndividualPerson39> getMtgAttndee() {
        if (mtgAttndee == null) {
            mtgAttndee = new ArrayList<IndividualPerson39>();
        }
        return this.mtgAttndee;
    }

    /**
     * Gets the value of the spcfcInstrReq property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificInstructionRequest2 }
     *     
     */
    public SpecificInstructionRequest2 getSpcfcInstrReq() {
        return spcfcInstrReq;
    }

    /**
     * Sets the value of the spcfcInstrReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificInstructionRequest2 }
     *     
     */
    public Instruction4 setSpcfcInstrReq(SpecificInstructionRequest2 value) {
        this.spcfcInstrReq = value;
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
     * Adds a new item to the mtgAttndee list.
     * @see #getMtgAttndee()
     * 
     */
    public Instruction4 addMtgAttndee(IndividualPerson39 mtgAttndee) {
        getMtgAttndee().add(mtgAttndee);
        return this;
    }

}
