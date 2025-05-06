
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "Instruction8", propOrder = {
    "snglInstrId",
    "reqdExctnDt",
    "voteExctnConf",
    "acctDtls",
    "prxy",
    "voteDtls",
    "mtgAttndee",
    "spcfcInstrReq"
})
public class Instruction8 {

    @XmlElement(name = "SnglInstrId", required = true)
    protected String snglInstrId;
    @XmlElement(name = "ReqdExctnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime reqdExctnDt;
    @XmlElement(name = "VoteExctnConf")
    protected boolean voteExctnConf;
    @XmlElement(name = "AcctDtls", required = true)
    protected SafekeepingAccount19 acctDtls;
    @XmlElement(name = "Prxy")
    protected Proxy12 prxy;
    @XmlElement(name = "VoteDtls")
    protected VoteDetails6 voteDtls;
    @XmlElement(name = "MtgAttndee")
    protected List<IndividualPerson41> mtgAttndee;
    @XmlElement(name = "SpcfcInstrReq")
    protected SpecificInstructionRequest4 spcfcInstrReq;

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
    public Instruction8 setSnglInstrId(String value) {
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
    public OffsetDateTime getReqdExctnDt() {
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
    public Instruction8 setReqdExctnDt(OffsetDateTime value) {
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
    public Instruction8 setVoteExctnConf(boolean value) {
        this.voteExctnConf = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingAccount19 }
     *     
     */
    public SafekeepingAccount19 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingAccount19 }
     *     
     */
    public Instruction8 setAcctDtls(SafekeepingAccount19 value) {
        this.acctDtls = value;
        return this;
    }

    /**
     * Gets the value of the prxy property.
     * 
     * @return
     *     possible object is
     *     {@link Proxy12 }
     *     
     */
    public Proxy12 getPrxy() {
        return prxy;
    }

    /**
     * Sets the value of the prxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proxy12 }
     *     
     */
    public Instruction8 setPrxy(Proxy12 value) {
        this.prxy = value;
        return this;
    }

    /**
     * Gets the value of the voteDtls property.
     * 
     * @return
     *     possible object is
     *     {@link VoteDetails6 }
     *     
     */
    public VoteDetails6 getVoteDtls() {
        return voteDtls;
    }

    /**
     * Sets the value of the voteDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteDetails6 }
     *     
     */
    public Instruction8 setVoteDtls(VoteDetails6 value) {
        this.voteDtls = value;
        return this;
    }

    /**
     * Gets the value of the mtgAttndee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mtgAttndee property.
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
     * {@link IndividualPerson41 }
     * 
     * 
     * @return
     *     The value of the mtgAttndee property.
     */
    public List<IndividualPerson41> getMtgAttndee() {
        if (mtgAttndee == null) {
            mtgAttndee = new ArrayList<>();
        }
        return this.mtgAttndee;
    }

    /**
     * Gets the value of the spcfcInstrReq property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificInstructionRequest4 }
     *     
     */
    public SpecificInstructionRequest4 getSpcfcInstrReq() {
        return spcfcInstrReq;
    }

    /**
     * Sets the value of the spcfcInstrReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificInstructionRequest4 }
     *     
     */
    public Instruction8 setSpcfcInstrReq(SpecificInstructionRequest4 value) {
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
    public Instruction8 addMtgAttndee(IndividualPerson41 mtgAttndee) {
        getMtgAttndee().add(mtgAttndee);
        return this;
    }

}
