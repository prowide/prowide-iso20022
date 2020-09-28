
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for sese.019.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reqForPEPOrISAOrPrtflInfV01"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.019.001.01")
public class MxSese01900101
    extends AbstractMX
{

    @XmlElement(name = "ReqForPEPOrISAOrPrtflInfV01", required = true)
    protected RequestForPEPOrISAOrPortfolioInformationV01 reqForPEPOrISAOrPrtflInfV01;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 19;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account5 .class, Account6 .class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, Extension1 .class, FinancialInstrument12 .class, GenderCode.class, GenericIdentification1 .class, ISAType2Code.class, ISAYearsOfIssue2 .class, IndividualPerson8 .class, MessageIdentification1 .class, MxSese01900101 .class, NameAndAddress5 .class, NamePrefix1Code.class, Organisation4 .class, PEPISATransfer5 .class, PartyIdentification2Choice.class, PartyIdentification4Choice.class, Portfolio1 .class, PostalAddress1 .class, PreviousYearChoice.class, RequestForPEPOrISAOrPortfolioInformationV01 .class, SecurityIdentification3Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.019.001.01";

    public MxSese01900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01900101(final String xml) {
        this();
        MxSese01900101 tmp = parse(xml);
        reqForPEPOrISAOrPrtflInfV01 = tmp.getReqForPEPOrISAOrPrtflInfV01();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the reqForPEPOrISAOrPrtflInfV01 property.
     * 
     * @return
     *     possible object is
     *     {@link RequestForPEPOrISAOrPortfolioInformationV01 }
     *     
     */
    public RequestForPEPOrISAOrPortfolioInformationV01 getReqForPEPOrISAOrPrtflInfV01() {
        return reqForPEPOrISAOrPrtflInfV01;
    }

    /**
     * Sets the value of the reqForPEPOrISAOrPrtflInfV01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForPEPOrISAOrPortfolioInformationV01 }
     *     
     */
    public MxSese01900101 setReqForPEPOrISAOrPrtflInfV01(RequestForPEPOrISAOrPortfolioInformationV01 value) {
        this.reqForPEPOrISAOrPrtflInfV01 = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSese01900101 parse(String xml) {
        return ((MxSese01900101) MxReadImpl.parse(MxSese01900101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01900101 parse(String xml, MxRead parserImpl) {
        return ((MxSese01900101) parserImpl.read(MxSese01900101 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxSese01900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01900101 message
     * @return
     *     a new instance of MxSese01900101
     */
    public final static MxSese01900101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese01900101 .class);
    }

}
