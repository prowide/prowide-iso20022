
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.046.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getRsvatn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.046.001.04")
public class MxCamt04600104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "GetRsvatn", required = true)
    protected GetReservationV04 getRsvatn;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 46;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AddressType2Code.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GetReservationV04 .class, MarketInfrastructureIdentification1Choice.class, MessageHeader9 .class, MxCamt04600104 .class, PostalAddress6 .class, QueryType2Code.class, RequestType4Choice.class, ReservationCriteria2Choice.class, ReservationCriteria3 .class, ReservationQuery2 .class, ReservationReturnCriteria1 .class, ReservationSearchCriteria2 .class, ReservationType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemIdentification2Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.046.001.04";

    public MxCamt04600104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt04600104(final String xml) {
        this();
        MxCamt04600104 tmp = parse(xml);
        getRsvatn = tmp.getGetRsvatn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt04600104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getRsvatn property.
     * 
     * @return
     *     possible object is
     *     {@link GetReservationV04 }
     *     
     */
    public GetReservationV04 getGetRsvatn() {
        return getRsvatn;
    }

    /**
     * Sets the value of the getRsvatn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReservationV04 }
     *     
     */
    public MxCamt04600104 setGetRsvatn(GetReservationV04 value) {
        this.getRsvatn = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCamt04600104 parse(String xml) {
        return ((MxCamt04600104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04600104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt04600104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt04600104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04600104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt04600104 parse(String xml, MxRead parserImpl) {
        return ((MxCamt04600104) parserImpl.read(MxCamt04600104 .class, xml, _classes));
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
     * Creates an MxCamt04600104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt04600104 message
     * @return
     *     a new instance of MxCamt04600104
     */
    public final static MxCamt04600104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt04600104 .class);
    }

}
