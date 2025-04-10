
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for canm.001.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ntwkMgmtInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:canm.001.001.02")
public class MxCanm00100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "NtwkMgmtInitn", required = true)
    protected NetworkManagementInitiationV02 ntwkMgmtInitn;
    public static final transient String BUSINESS_PROCESS = "canm";
    public static final transient int FUNCTIONALITY = 1;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Action9 .class, ActionDestination1Code.class, ActionType10Code.class, ActionType11Code.class, AdditionalAction1 .class, AdditionalData1 .class, AdditionalFee1 .class, AdditionalInformation20 .class, ApprovalData1 .class, ApprovalEntity1 .class, BatchManagementInformation1 .class, CardProgrammeMode1 .class, Content1 .class, ContentInformationType20 .class, Context8 .class, FeeAmount2 .class, GenericIdentification172 .class, Header43 .class, MACData1 .class, MessageFunction23Code.class, MxCanm00100102 .class, NetworkManagementInitiation1 .class, NetworkManagementInitiationV02 .class, NetworkManagementType1Code.class, OutputFormat4Code.class, PartyType17Code.class, PartyType18Code.class, PartyType20Code.class, PartyType21Code.class, PartyType22Code.class, PartyType26Code.class, PartyType9Code.class, ProcessingResult1 .class, Response8Code.class, ResultData1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Traceability7 .class, Transaction99 .class, TransactionContext5 .class, TransactionIdentification12 .class, TransactionLifeCycleIdentification2 .class, TypeOfAmount10Code.class, UserInterface6Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:canm.001.001.02";

    public MxCanm00100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCanm00100102(final String xml) {
        this();
        MxCanm00100102 tmp = parse(xml);
        ntwkMgmtInitn = tmp.getNtwkMgmtInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCanm00100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ntwkMgmtInitn property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkManagementInitiationV02 }
     *     
     */
    public NetworkManagementInitiationV02 getNtwkMgmtInitn() {
        return ntwkMgmtInitn;
    }

    /**
     * Sets the value of the ntwkMgmtInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementInitiationV02 }
     *     
     */
    public MxCanm00100102 setNtwkMgmtInitn(NetworkManagementInitiationV02 value) {
        this.ntwkMgmtInitn = value;
        return this;
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
    public static MxCanm00100102 parse(String xml) {
        return ((MxCanm00100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCanm00100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCanm00100102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCanm00100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCanm00100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCanm00100102 parse(String xml, MxRead parserImpl) {
        return ((MxCanm00100102) parserImpl.read(MxCanm00100102 .class, xml, _classes));
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
     * Creates an MxCanm00100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCanm00100102 message
     * @return
     *     a new instance of MxCanm00100102
     */
    public static final MxCanm00100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCanm00100102 .class);
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
