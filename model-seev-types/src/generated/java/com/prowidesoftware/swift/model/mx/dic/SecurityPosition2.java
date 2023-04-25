
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
 * Net position of a segregated holding, in a single security, within the overall position held in a securities account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityPosition2", propOrder = {
    "pos",
    "mtgAttndee",
    "prxy",
    "voteDtls",
    "prtcptnRegnReq",
    "blckgReq",
    "sctiesRegnReq"
})
public class SecurityPosition2 {

    @XmlElement(name = "Pos")
    protected EligiblePosition pos;
    @XmlElement(name = "MtgAttndee")
    protected List<VotingPartyAndInstruction> mtgAttndee;
    @XmlElement(name = "Prxy")
    protected List<VotingPartyAndInstruction> prxy;
    @XmlElement(name = "VoteDtls")
    protected List<VoteInstruction> voteDtls;
    @XmlElement(name = "PrtcptnRegnReq")
    protected List<RequestInformation> prtcptnRegnReq;
    @XmlElement(name = "BlckgReq")
    protected List<RequestInformation> blckgReq;
    @XmlElement(name = "SctiesRegnReq")
    protected List<RequestInformation> sctiesRegnReq;

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link EligiblePosition }
     *     
     */
    public EligiblePosition getPos() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligiblePosition }
     *     
     */
    public SecurityPosition2 setPos(EligiblePosition value) {
        this.pos = value;
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
     * {@link VotingPartyAndInstruction }
     * 
     * 
     * @return
     *     The value of the mtgAttndee property.
     */
    public List<VotingPartyAndInstruction> getMtgAttndee() {
        if (mtgAttndee == null) {
            mtgAttndee = new ArrayList<>();
        }
        return this.mtgAttndee;
    }

    /**
     * Gets the value of the prxy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prxy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrxy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VotingPartyAndInstruction }
     * 
     * 
     * @return
     *     The value of the prxy property.
     */
    public List<VotingPartyAndInstruction> getPrxy() {
        if (prxy == null) {
            prxy = new ArrayList<>();
        }
        return this.prxy;
    }

    /**
     * Gets the value of the voteDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the voteDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoteDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoteInstruction }
     * 
     * 
     * @return
     *     The value of the voteDtls property.
     */
    public List<VoteInstruction> getVoteDtls() {
        if (voteDtls == null) {
            voteDtls = new ArrayList<>();
        }
        return this.voteDtls;
    }

    /**
     * Gets the value of the prtcptnRegnReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prtcptnRegnReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtcptnRegnReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestInformation }
     * 
     * 
     * @return
     *     The value of the prtcptnRegnReq property.
     */
    public List<RequestInformation> getPrtcptnRegnReq() {
        if (prtcptnRegnReq == null) {
            prtcptnRegnReq = new ArrayList<>();
        }
        return this.prtcptnRegnReq;
    }

    /**
     * Gets the value of the blckgReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the blckgReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlckgReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestInformation }
     * 
     * 
     * @return
     *     The value of the blckgReq property.
     */
    public List<RequestInformation> getBlckgReq() {
        if (blckgReq == null) {
            blckgReq = new ArrayList<>();
        }
        return this.blckgReq;
    }

    /**
     * Gets the value of the sctiesRegnReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesRegnReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesRegnReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestInformation }
     * 
     * 
     * @return
     *     The value of the sctiesRegnReq property.
     */
    public List<RequestInformation> getSctiesRegnReq() {
        if (sctiesRegnReq == null) {
            sctiesRegnReq = new ArrayList<>();
        }
        return this.sctiesRegnReq;
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
    public SecurityPosition2 addMtgAttndee(VotingPartyAndInstruction mtgAttndee) {
        getMtgAttndee().add(mtgAttndee);
        return this;
    }

    /**
     * Adds a new item to the prxy list.
     * @see #getPrxy()
     * 
     */
    public SecurityPosition2 addPrxy(VotingPartyAndInstruction prxy) {
        getPrxy().add(prxy);
        return this;
    }

    /**
     * Adds a new item to the voteDtls list.
     * @see #getVoteDtls()
     * 
     */
    public SecurityPosition2 addVoteDtls(VoteInstruction voteDtls) {
        getVoteDtls().add(voteDtls);
        return this;
    }

    /**
     * Adds a new item to the prtcptnRegnReq list.
     * @see #getPrtcptnRegnReq()
     * 
     */
    public SecurityPosition2 addPrtcptnRegnReq(RequestInformation prtcptnRegnReq) {
        getPrtcptnRegnReq().add(prtcptnRegnReq);
        return this;
    }

    /**
     * Adds a new item to the blckgReq list.
     * @see #getBlckgReq()
     * 
     */
    public SecurityPosition2 addBlckgReq(RequestInformation blckgReq) {
        getBlckgReq().add(blckgReq);
        return this;
    }

    /**
     * Adds a new item to the sctiesRegnReq list.
     * @see #getSctiesRegnReq()
     * 
     */
    public SecurityPosition2 addSctiesRegnReq(RequestInformation sctiesRegnReq) {
        getSctiesRegnReq().add(sctiesRegnReq);
        return this;
    }

}
