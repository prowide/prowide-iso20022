
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
 * Resources of a legal entity or other financial construct that are available to meet cash obligations.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiquidResources1", propOrder = {
    "cshDue",
    "fcltiesCmmtdLinesOfCdt",
    "fcltiesCmmtdRpAgrmts",
    "fcltiesCmmtdFxSwps",
    "fcltiesOthrCmmtd",
    "fcltiesUcmmtd",
    "finInstrmsCCP",
    "finInstrmsTrsrInvstmts",
    "finInstrmsDfltrsSttlmColl",
    "finInstrmsDfltrsNonCshColl"
})
public class LiquidResources1 {

    @XmlElement(name = "CshDue", required = true)
    protected List<LiquidResourceInformation1> cshDue;
    @XmlElement(name = "FcltiesCmmtdLinesOfCdt")
    protected List<LiquidResourceInformation1> fcltiesCmmtdLinesOfCdt;
    @XmlElement(name = "FcltiesCmmtdRpAgrmts")
    protected List<LiquidResourceInformation1> fcltiesCmmtdRpAgrmts;
    @XmlElement(name = "FcltiesCmmtdFxSwps")
    protected List<LiquidResourceInformation1> fcltiesCmmtdFxSwps;
    @XmlElement(name = "FcltiesOthrCmmtd")
    protected List<LiquidResourceInformation1> fcltiesOthrCmmtd;
    @XmlElement(name = "FcltiesUcmmtd")
    protected List<LiquidResourceInformation1> fcltiesUcmmtd;
    @XmlElement(name = "FinInstrmsCCP")
    protected List<LiquidResourceInformation1> finInstrmsCCP;
    @XmlElement(name = "FinInstrmsTrsrInvstmts")
    protected List<LiquidResourceInformation1> finInstrmsTrsrInvstmts;
    @XmlElement(name = "FinInstrmsDfltrsSttlmColl")
    protected List<LiquidResourceInformation1> finInstrmsDfltrsSttlmColl;
    @XmlElement(name = "FinInstrmsDfltrsNonCshColl")
    protected List<LiquidResourceInformation1> finInstrmsDfltrsNonCshColl;

    /**
     * Gets the value of the cshDue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshDue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshDue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidResourceInformation1 }
     * 
     * 
     */
    public List<LiquidResourceInformation1> getCshDue() {
        if (cshDue == null) {
            cshDue = new ArrayList<LiquidResourceInformation1>();
        }
        return this.cshDue;
    }

    /**
     * Gets the value of the fcltiesCmmtdLinesOfCdt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fcltiesCmmtdLinesOfCdt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFcltiesCmmtdLinesOfCdt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidResourceInformation1 }
     * 
     * 
     */
    public List<LiquidResourceInformation1> getFcltiesCmmtdLinesOfCdt() {
        if (fcltiesCmmtdLinesOfCdt == null) {
            fcltiesCmmtdLinesOfCdt = new ArrayList<LiquidResourceInformation1>();
        }
        return this.fcltiesCmmtdLinesOfCdt;
    }

    /**
     * Gets the value of the fcltiesCmmtdRpAgrmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fcltiesCmmtdRpAgrmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFcltiesCmmtdRpAgrmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidResourceInformation1 }
     * 
     * 
     */
    public List<LiquidResourceInformation1> getFcltiesCmmtdRpAgrmts() {
        if (fcltiesCmmtdRpAgrmts == null) {
            fcltiesCmmtdRpAgrmts = new ArrayList<LiquidResourceInformation1>();
        }
        return this.fcltiesCmmtdRpAgrmts;
    }

    /**
     * Gets the value of the fcltiesCmmtdFxSwps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fcltiesCmmtdFxSwps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFcltiesCmmtdFxSwps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidResourceInformation1 }
     * 
     * 
     */
    public List<LiquidResourceInformation1> getFcltiesCmmtdFxSwps() {
        if (fcltiesCmmtdFxSwps == null) {
            fcltiesCmmtdFxSwps = new ArrayList<LiquidResourceInformation1>();
        }
        return this.fcltiesCmmtdFxSwps;
    }

    /**
     * Gets the value of the fcltiesOthrCmmtd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fcltiesOthrCmmtd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFcltiesOthrCmmtd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidResourceInformation1 }
     * 
     * 
     */
    public List<LiquidResourceInformation1> getFcltiesOthrCmmtd() {
        if (fcltiesOthrCmmtd == null) {
            fcltiesOthrCmmtd = new ArrayList<LiquidResourceInformation1>();
        }
        return this.fcltiesOthrCmmtd;
    }

    /**
     * Gets the value of the fcltiesUcmmtd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fcltiesUcmmtd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFcltiesUcmmtd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidResourceInformation1 }
     * 
     * 
     */
    public List<LiquidResourceInformation1> getFcltiesUcmmtd() {
        if (fcltiesUcmmtd == null) {
            fcltiesUcmmtd = new ArrayList<LiquidResourceInformation1>();
        }
        return this.fcltiesUcmmtd;
    }

    /**
     * Gets the value of the finInstrmsCCP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finInstrmsCCP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmsCCP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidResourceInformation1 }
     * 
     * 
     */
    public List<LiquidResourceInformation1> getFinInstrmsCCP() {
        if (finInstrmsCCP == null) {
            finInstrmsCCP = new ArrayList<LiquidResourceInformation1>();
        }
        return this.finInstrmsCCP;
    }

    /**
     * Gets the value of the finInstrmsTrsrInvstmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finInstrmsTrsrInvstmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmsTrsrInvstmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidResourceInformation1 }
     * 
     * 
     */
    public List<LiquidResourceInformation1> getFinInstrmsTrsrInvstmts() {
        if (finInstrmsTrsrInvstmts == null) {
            finInstrmsTrsrInvstmts = new ArrayList<LiquidResourceInformation1>();
        }
        return this.finInstrmsTrsrInvstmts;
    }

    /**
     * Gets the value of the finInstrmsDfltrsSttlmColl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finInstrmsDfltrsSttlmColl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmsDfltrsSttlmColl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidResourceInformation1 }
     * 
     * 
     */
    public List<LiquidResourceInformation1> getFinInstrmsDfltrsSttlmColl() {
        if (finInstrmsDfltrsSttlmColl == null) {
            finInstrmsDfltrsSttlmColl = new ArrayList<LiquidResourceInformation1>();
        }
        return this.finInstrmsDfltrsSttlmColl;
    }

    /**
     * Gets the value of the finInstrmsDfltrsNonCshColl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finInstrmsDfltrsNonCshColl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmsDfltrsNonCshColl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidResourceInformation1 }
     * 
     * 
     */
    public List<LiquidResourceInformation1> getFinInstrmsDfltrsNonCshColl() {
        if (finInstrmsDfltrsNonCshColl == null) {
            finInstrmsDfltrsNonCshColl = new ArrayList<LiquidResourceInformation1>();
        }
        return this.finInstrmsDfltrsNonCshColl;
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
     * Adds a new item to the cshDue list.
     * @see #getCshDue()
     * 
     */
    public LiquidResources1 addCshDue(LiquidResourceInformation1 cshDue) {
        getCshDue().add(cshDue);
        return this;
    }

    /**
     * Adds a new item to the fcltiesCmmtdLinesOfCdt list.
     * @see #getFcltiesCmmtdLinesOfCdt()
     * 
     */
    public LiquidResources1 addFcltiesCmmtdLinesOfCdt(LiquidResourceInformation1 fcltiesCmmtdLinesOfCdt) {
        getFcltiesCmmtdLinesOfCdt().add(fcltiesCmmtdLinesOfCdt);
        return this;
    }

    /**
     * Adds a new item to the fcltiesCmmtdRpAgrmts list.
     * @see #getFcltiesCmmtdRpAgrmts()
     * 
     */
    public LiquidResources1 addFcltiesCmmtdRpAgrmts(LiquidResourceInformation1 fcltiesCmmtdRpAgrmts) {
        getFcltiesCmmtdRpAgrmts().add(fcltiesCmmtdRpAgrmts);
        return this;
    }

    /**
     * Adds a new item to the fcltiesCmmtdFxSwps list.
     * @see #getFcltiesCmmtdFxSwps()
     * 
     */
    public LiquidResources1 addFcltiesCmmtdFxSwps(LiquidResourceInformation1 fcltiesCmmtdFxSwps) {
        getFcltiesCmmtdFxSwps().add(fcltiesCmmtdFxSwps);
        return this;
    }

    /**
     * Adds a new item to the fcltiesOthrCmmtd list.
     * @see #getFcltiesOthrCmmtd()
     * 
     */
    public LiquidResources1 addFcltiesOthrCmmtd(LiquidResourceInformation1 fcltiesOthrCmmtd) {
        getFcltiesOthrCmmtd().add(fcltiesOthrCmmtd);
        return this;
    }

    /**
     * Adds a new item to the fcltiesUcmmtd list.
     * @see #getFcltiesUcmmtd()
     * 
     */
    public LiquidResources1 addFcltiesUcmmtd(LiquidResourceInformation1 fcltiesUcmmtd) {
        getFcltiesUcmmtd().add(fcltiesUcmmtd);
        return this;
    }

    /**
     * Adds a new item to the finInstrmsCCP list.
     * @see #getFinInstrmsCCP()
     * 
     */
    public LiquidResources1 addFinInstrmsCCP(LiquidResourceInformation1 finInstrmsCCP) {
        getFinInstrmsCCP().add(finInstrmsCCP);
        return this;
    }

    /**
     * Adds a new item to the finInstrmsTrsrInvstmts list.
     * @see #getFinInstrmsTrsrInvstmts()
     * 
     */
    public LiquidResources1 addFinInstrmsTrsrInvstmts(LiquidResourceInformation1 finInstrmsTrsrInvstmts) {
        getFinInstrmsTrsrInvstmts().add(finInstrmsTrsrInvstmts);
        return this;
    }

    /**
     * Adds a new item to the finInstrmsDfltrsSttlmColl list.
     * @see #getFinInstrmsDfltrsSttlmColl()
     * 
     */
    public LiquidResources1 addFinInstrmsDfltrsSttlmColl(LiquidResourceInformation1 finInstrmsDfltrsSttlmColl) {
        getFinInstrmsDfltrsSttlmColl().add(finInstrmsDfltrsSttlmColl);
        return this;
    }

    /**
     * Adds a new item to the finInstrmsDfltrsNonCshColl list.
     * @see #getFinInstrmsDfltrsNonCshColl()
     * 
     */
    public LiquidResources1 addFinInstrmsDfltrsNonCshColl(LiquidResourceInformation1 finInstrmsDfltrsNonCshColl) {
        getFinInstrmsDfltrsNonCshColl().add(finInstrmsDfltrsNonCshColl);
        return this;
    }

}
