
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for setr.034.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "listOrdrCclReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.034.001.01")
public class MxSetr03400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ListOrdrCclReq", required = true)
    protected ListOrderCancelRequest listOrdrCclReq;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 34;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, AddressType2Code.class, AlternatePartyIdentification1 .class, CashAccountIdentification2Choice.class, CashParties1 .class, CopyDuplicate1Code.class, DateAndDateTimeChoice.class, DocumentIdentification11 .class, GenericIdentification1 .class, GenericIdentification13 .class, IdentificationType2Choice.class, Intermediary14 .class, List2 .class, ListOrderCancelRequest.class, MxSetr03400101 .class, NameAndAddress5 .class, OtherParties1 .class, PartyIdentification12Choice.class, PartyIdentification23 .class, PartyIdentification29 .class, PartyIdentification2Choice.class, PartyIdentification3Choice.class, PartyIdentificationAndAccount10 .class, PartyIdentificationAndAccount11 .class, PartyIdentificationAndAccount12 .class, PartyIdentificationAndAccount8 .class, PartyIdentificationAndAccount9 .class, PartyRole1Choice.class, PartyTextInformation1 .class, PartyType1Code.class, PostalAddress1 .class, PurposeCode1Choice.class, SecuritiesAccount2 .class, SecuritiesAccountPurposeType1Code.class, SettlementParties3 .class, SimpleIdentificationInformation2 .class, TypeOfIdentification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.034.001.01";

    public MxSetr03400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr03400101(final String xml) {
        this();
        MxSetr03400101 tmp = parse(xml);
        listOrdrCclReq = tmp.getListOrdrCclReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr03400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the listOrdrCclReq property.
     * 
     * @return
     *     possible object is
     *     {@link ListOrderCancelRequest }
     *     
     */
    public ListOrderCancelRequest getListOrdrCclReq() {
        return listOrdrCclReq;
    }

    /**
     * Sets the value of the listOrdrCclReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOrderCancelRequest }
     *     
     */
    public MxSetr03400101 setListOrdrCclReq(ListOrderCancelRequest value) {
        this.listOrdrCclReq = value;
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
    public static MxSetr03400101 parse(String xml) {
        return ((MxSetr03400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr03400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr03400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr03400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr03400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr03400101 parse(String xml, MxRead parserImpl) {
        return ((MxSetr03400101) parserImpl.read(MxSetr03400101 .class, xml, _classes));
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
     * Creates an MxSetr03400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr03400101 message
     * @return
     *     a new instance of MxSetr03400101
     */
    public final static MxSetr03400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr03400101 .class);
    }

}
