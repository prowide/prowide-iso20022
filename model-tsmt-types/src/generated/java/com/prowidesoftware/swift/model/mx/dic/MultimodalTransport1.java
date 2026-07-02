
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
@XmlType(name = "MultimodalTransport1", propOrder = {
    "dprtureAirprt",
    "dstnAirprt",
    "portOfLoadng",
    "portOfDschrge",
    "plcOfRct",
    "plcOfDlvry",
    "takngInChrg",
    "plcOfFnlDstn"
})
public class MultimodalTransport1 {

    @XmlElement(name = "DprtureAirprt")
    protected List<AirportName1Choice> dprtureAirprt;
    @XmlElement(name = "DstnAirprt")
    protected List<AirportName1Choice> dstnAirprt;
    @XmlElement(name = "PortOfLoadng")
    protected List<String> portOfLoadng;
    @XmlElement(name = "PortOfDschrge")
    protected List<String> portOfDschrge;
    @XmlElement(name = "PlcOfRct")
    protected List<String> plcOfRct;
    @XmlElement(name = "PlcOfDlvry")
    protected List<String> plcOfDlvry;
    @XmlElement(name = "TakngInChrg")
    protected List<String> takngInChrg;
    @XmlElement(name = "PlcOfFnlDstn")
    protected List<String> plcOfFnlDstn;

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
    public MultimodalTransport1 addDprtureAirprt(AirportName1Choice dprtureAirprt) {
        getDprtureAirprt().add(dprtureAirprt);
        return this;
    }

    /**
     * Adds a new item to the dstnAirprt list.
     * @see #getDstnAirprt()
     * 
     */
    public MultimodalTransport1 addDstnAirprt(AirportName1Choice dstnAirprt) {
        getDstnAirprt().add(dstnAirprt);
        return this;
    }

    /**
     * Adds a new item to the portOfLoadng list.
     * @see #getPortOfLoadng()
     * 
     */
    public MultimodalTransport1 addPortOfLoadng(String portOfLoadng) {
        getPortOfLoadng().add(portOfLoadng);
        return this;
    }

    /**
     * Adds a new item to the portOfDschrge list.
     * @see #getPortOfDschrge()
     * 
     */
    public MultimodalTransport1 addPortOfDschrge(String portOfDschrge) {
        getPortOfDschrge().add(portOfDschrge);
        return this;
    }

    /**
     * Adds a new item to the plcOfRct list.
     * @see #getPlcOfRct()
     * 
     */
    public MultimodalTransport1 addPlcOfRct(String plcOfRct) {
        getPlcOfRct().add(plcOfRct);
        return this;
    }

    /**
     * Adds a new item to the plcOfDlvry list.
     * @see #getPlcOfDlvry()
     * 
     */
    public MultimodalTransport1 addPlcOfDlvry(String plcOfDlvry) {
        getPlcOfDlvry().add(plcOfDlvry);
        return this;
    }

    /**
     * Adds a new item to the takngInChrg list.
     * @see #getTakngInChrg()
     * 
     */
    public MultimodalTransport1 addTakngInChrg(String takngInChrg) {
        getTakngInChrg().add(takngInChrg);
        return this;
    }

    /**
     * Adds a new item to the plcOfFnlDstn list.
     * @see #getPlcOfFnlDstn()
     * 
     */
    public MultimodalTransport1 addPlcOfFnlDstn(String plcOfFnlDstn) {
        getPlcOfFnlDstn().add(plcOfFnlDstn);
        return this;
    }

}
