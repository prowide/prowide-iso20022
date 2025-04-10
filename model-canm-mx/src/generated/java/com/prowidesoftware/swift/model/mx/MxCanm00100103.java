
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
 * Class for canm.001.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ntwkMgmtInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:canm.001.001.03")
public class MxCanm00100103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "NtwkMgmtInitn", required = true)
    protected NetworkManagementInitiationV03 ntwkMgmtInitn;
    public final static transient String BUSINESS_PROCESS = "canm";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Action13 .class, ActionDestination1Code.class, ActionType10Code.class, ActionType11Code.class, AdditionalAction1 .class, AdditionalData1 .class, AdditionalFee2 .class, AdditionalInformation29 .class, ApprovalEntity2 .class, BatchManagementInformation1 .class, CardProgrammeMode3 .class, Contact6 .class, Content1 .class, ContentInformationType20 .class, Context17 .class, CreditDebit3Code.class, FeeAmount3 .class, GenericIdentification183 .class, Header63 .class, Jurisdiction2 .class, MACData1 .class, MessageFunction23Code.class, MxCanm00100103 .class, NetworkManagementInitiation2 .class, NetworkManagementInitiationV03 .class, NetworkManagementType1Code.class, OutputFormat4Code.class, PartyType17Code.class, PartyType18Code.class, PartyType20Code.class, PartyType21Code.class, PartyType22Code.class, PartyType26Code.class, PartyType9Code.class, Priority3Code.class, ProcessingResult16 .class, Reconciliation3 .class, Response8Code.class, ResultData7 .class, SettlementReportingEntity1 .class, SettlementService4 .class, SettlementServiceDate2 .class, SettlementServiceMode1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Traceability9 .class, Transaction134 .class, TransactionContext10 .class, TransactionIdentification12 .class, TransactionLifeCycleIdentification2 .class, TypeOfAmount21Code.class, UserInterface6Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:canm.001.001.03";

    public MxCanm00100103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCanm00100103(final String xml) {
        this();
        MxCanm00100103 tmp = parse(xml);
        ntwkMgmtInitn = tmp.getNtwkMgmtInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCanm00100103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ntwkMgmtInitn property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkManagementInitiationV03 }
     *     
     */
    public NetworkManagementInitiationV03 getNtwkMgmtInitn() {
        return ntwkMgmtInitn;
    }

    /**
     * Sets the value of the ntwkMgmtInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementInitiationV03 }
     *     
     */
    public MxCanm00100103 setNtwkMgmtInitn(NetworkManagementInitiationV03 value) {
        this.ntwkMgmtInitn = value;
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
    public static MxCanm00100103 parse(String xml) {
        return ((MxCanm00100103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCanm00100103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCanm00100103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCanm00100103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCanm00100103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCanm00100103 parse(String xml, MxRead parserImpl) {
        return ((MxCanm00100103) parserImpl.read(MxCanm00100103 .class, xml, _classes));
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
     * Creates an MxCanm00100103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCanm00100103 message
     * @return
     *     a new instance of MxCanm00100103
     */
    public final static MxCanm00100103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCanm00100103 .class);
    }

}
