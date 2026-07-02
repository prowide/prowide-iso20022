
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
 * Information related to multimodal transportation of goods.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultimodalTransport2", propOrder = {
    "dprtureAirprt",
    "dstnAirprt",
    "airCrrierNm",
    "portOfLoadng",
    "portOfDschrge",
    "vsslNm",
    "plcOfRct",
    "plcOfDlvry",
    "takngInChrg",
    "plcOfFnlDstn",
    "trnstLctn",
    "roadCrrierNm",
    "railCrrierNm"
})
public class MultimodalTransport2 {

    @XmlElement(name = "DprtureAirprt")
    protected List<AirportName1Choice> dprtureAirprt;
    @XmlElement(name = "DstnAirprt")
    protected List<AirportName1Choice> dstnAirprt;
    @XmlElement(name = "AirCrrierNm")
    protected List<String> airCrrierNm;
    @XmlElement(name = "PortOfLoadng")
    protected List<String> portOfLoadng;
    @XmlElement(name = "PortOfDschrge")
    protected List<String> portOfDschrge;
    @XmlElement(name = "VsslNm")
    protected List<String> vsslNm;
    @XmlElement(name = "PlcOfRct")
    protected List<String> plcOfRct;
    @XmlElement(name = "PlcOfDlvry")
    protected List<String> plcOfDlvry;
    @XmlElement(name = "TakngInChrg")
    protected List<String> takngInChrg;
    @XmlElement(name = "PlcOfFnlDstn")
    protected List<String> plcOfFnlDstn;
    @XmlElement(name = "TrnstLctn")
    protected List<String> trnstLctn;
    @XmlElement(name = "RoadCrrierNm")
    protected List<String> roadCrrierNm;
    @XmlElement(name = "RailCrrierNm")
    protected List<String> railCrrierNm;

    /**
     * Gets the value of the dprtureAirprt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dprtureAirprt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDprtureAirprt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportName1Choice }
     * 
     * 
     */
    public List<AirportName1Choice> getDprtureAirprt() {
        if (dprtureAirprt == null) {
            dprtureAirprt = new ArrayList<AirportName1Choice>();
        }
        return this.dprtureAirprt;
    }

    /**
     * Gets the value of the dstnAirprt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dstnAirprt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDstnAirprt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportName1Choice }
     * 
     * 
     */
    public List<AirportName1Choice> getDstnAirprt() {
        if (dstnAirprt == null) {
            dstnAirprt = new ArrayList<AirportName1Choice>();
        }
        return this.dstnAirprt;
    }

    /**
     * Gets the value of the airCrrierNm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airCrrierNm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirCrrierNm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAirCrrierNm() {
        if (airCrrierNm == null) {
            airCrrierNm = new ArrayList<String>();
        }
        return this.airCrrierNm;
    }

    /**
     * Gets the value of the portOfLoadng property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portOfLoadng property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortOfLoadng().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPortOfLoadng() {
        if (portOfLoadng == null) {
            portOfLoadng = new ArrayList<String>();
        }
        return this.portOfLoadng;
    }

    /**
     * Gets the value of the portOfDschrge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portOfDschrge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortOfDschrge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPortOfDschrge() {
        if (portOfDschrge == null) {
            portOfDschrge = new ArrayList<String>();
        }
        return this.portOfDschrge;
    }

    /**
     * Gets the value of the vsslNm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vsslNm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVsslNm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVsslNm() {
        if (vsslNm == null) {
            vsslNm = new ArrayList<String>();
        }
        return this.vsslNm;
    }

    /**
     * Gets the value of the plcOfRct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plcOfRct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlcOfRct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPlcOfRct() {
        if (plcOfRct == null) {
            plcOfRct = new ArrayList<String>();
        }
        return this.plcOfRct;
    }

    /**
     * Gets the value of the plcOfDlvry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plcOfDlvry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlcOfDlvry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPlcOfDlvry() {
        if (plcOfDlvry == null) {
            plcOfDlvry = new ArrayList<String>();
        }
        return this.plcOfDlvry;
    }

    /**
     * Gets the value of the takngInChrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the takngInChrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTakngInChrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTakngInChrg() {
        if (takngInChrg == null) {
            takngInChrg = new ArrayList<String>();
        }
        return this.takngInChrg;
    }

    /**
     * Gets the value of the plcOfFnlDstn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plcOfFnlDstn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlcOfFnlDstn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPlcOfFnlDstn() {
        if (plcOfFnlDstn == null) {
            plcOfFnlDstn = new ArrayList<String>();
        }
        return this.plcOfFnlDstn;
    }

    /**
     * Gets the value of the trnstLctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trnstLctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnstLctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTrnstLctn() {
        if (trnstLctn == null) {
            trnstLctn = new ArrayList<String>();
        }
        return this.trnstLctn;
    }

    /**
     * Gets the value of the roadCrrierNm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roadCrrierNm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadCrrierNm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoadCrrierNm() {
        if (roadCrrierNm == null) {
            roadCrrierNm = new ArrayList<String>();
        }
        return this.roadCrrierNm;
    }

    /**
     * Gets the value of the railCrrierNm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railCrrierNm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailCrrierNm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRailCrrierNm() {
        if (railCrrierNm == null) {
            railCrrierNm = new ArrayList<String>();
        }
        return this.railCrrierNm;
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
     * Adds a new item to the dprtureAirprt list.
     * @see #getDprtureAirprt()
     * 
     */
    public MultimodalTransport2 addDprtureAirprt(AirportName1Choice dprtureAirprt) {
        getDprtureAirprt().add(dprtureAirprt);
        return this;
    }

    /**
     * Adds a new item to the dstnAirprt list.
     * @see #getDstnAirprt()
     * 
     */
    public MultimodalTransport2 addDstnAirprt(AirportName1Choice dstnAirprt) {
        getDstnAirprt().add(dstnAirprt);
        return this;
    }

    /**
     * Adds a new item to the airCrrierNm list.
     * @see #getAirCrrierNm()
     * 
     */
    public MultimodalTransport2 addAirCrrierNm(String airCrrierNm) {
        getAirCrrierNm().add(airCrrierNm);
        return this;
    }

    /**
     * Adds a new item to the portOfLoadng list.
     * @see #getPortOfLoadng()
     * 
     */
    public MultimodalTransport2 addPortOfLoadng(String portOfLoadng) {
        getPortOfLoadng().add(portOfLoadng);
        return this;
    }

    /**
     * Adds a new item to the portOfDschrge list.
     * @see #getPortOfDschrge()
     * 
     */
    public MultimodalTransport2 addPortOfDschrge(String portOfDschrge) {
        getPortOfDschrge().add(portOfDschrge);
        return this;
    }

    /**
     * Adds a new item to the vsslNm list.
     * @see #getVsslNm()
     * 
     */
    public MultimodalTransport2 addVsslNm(String vsslNm) {
        getVsslNm().add(vsslNm);
        return this;
    }

    /**
     * Adds a new item to the plcOfRct list.
     * @see #getPlcOfRct()
     * 
     */
    public MultimodalTransport2 addPlcOfRct(String plcOfRct) {
        getPlcOfRct().add(plcOfRct);
        return this;
    }

    /**
     * Adds a new item to the plcOfDlvry list.
     * @see #getPlcOfDlvry()
     * 
     */
    public MultimodalTransport2 addPlcOfDlvry(String plcOfDlvry) {
        getPlcOfDlvry().add(plcOfDlvry);
        return this;
    }

    /**
     * Adds a new item to the takngInChrg list.
     * @see #getTakngInChrg()
     * 
     */
    public MultimodalTransport2 addTakngInChrg(String takngInChrg) {
        getTakngInChrg().add(takngInChrg);
        return this;
    }

    /**
     * Adds a new item to the plcOfFnlDstn list.
     * @see #getPlcOfFnlDstn()
     * 
     */
    public MultimodalTransport2 addPlcOfFnlDstn(String plcOfFnlDstn) {
        getPlcOfFnlDstn().add(plcOfFnlDstn);
        return this;
    }

    /**
     * Adds a new item to the trnstLctn list.
     * @see #getTrnstLctn()
     * 
     */
    public MultimodalTransport2 addTrnstLctn(String trnstLctn) {
        getTrnstLctn().add(trnstLctn);
        return this;
    }

    /**
     * Adds a new item to the roadCrrierNm list.
     * @see #getRoadCrrierNm()
     * 
     */
    public MultimodalTransport2 addRoadCrrierNm(String roadCrrierNm) {
        getRoadCrrierNm().add(roadCrrierNm);
        return this;
    }

    /**
     * Adds a new item to the railCrrierNm list.
     * @see #getRailCrrierNm()
     * 
     */
    public MultimodalTransport2 addRailCrrierNm(String railCrrierNm) {
        getRailCrrierNm().add(railCrrierNm);
        return this;
    }

}
