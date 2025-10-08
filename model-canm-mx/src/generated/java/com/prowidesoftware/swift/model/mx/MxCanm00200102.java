
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
 * Class for canm.002.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ntwkMgmtRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:canm.002.001.02")
public class MxCanm00200102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "NtwkMgmtRspn", required = true)
    protected NetworkManagementResponseV02 ntwkMgmtRspn;
    public final static transient String BUSINESS_PROCESS = "canm";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Action9 .class, ActionDestination1Code.class, ActionType10Code.class, ActionType11Code.class, AdditionalAction1 .class, AdditionalData1 .class, AdditionalFee1 .class, AdditionalInformation20 .class, ApprovalData1 .class, ApprovalEntity1 .class, BatchManagementInformation1 .class, CardProgrammeMode1 .class, Content1 .class, ContentInformationType20 .class, Context8 .class, FeeAmount2 .class, GenericIdentification172 .class, Header43 .class, MACData1 .class, MessageFunction23Code.class, MxCanm00200102 .class, NetworkManagementResponse1 .class, NetworkManagementResponseV02 .class, NetworkManagementType1Code.class, OutputFormat4Code.class, PartyType17Code.class, PartyType18Code.class, PartyType20Code.class, PartyType21Code.class, PartyType22Code.class, PartyType26Code.class, PartyType9Code.class, ProcessingResult1 .class, Response8Code.class, ResultData1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Traceability7 .class, Transaction99 .class, TransactionContext5 .class, TransactionIdentification12 .class, TransactionLifeCycleIdentification2 .class, TypeOfAmount10Code.class, UserInterface6Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:canm.002.001.02";

    public MxCanm00200102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCanm00200102(final String xml) {
        this();
        MxCanm00200102 tmp = parse(xml);
        ntwkMgmtRspn = tmp.getNtwkMgmtRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCanm00200102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ntwkMgmtRspn property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkManagementResponseV02 }
     *     
     */
    public NetworkManagementResponseV02 getNtwkMgmtRspn() {
        return ntwkMgmtRspn;
    }

    /**
     * Sets the value of the ntwkMgmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementResponseV02 }
     *     
     */
    public MxCanm00200102 setNtwkMgmtRspn(NetworkManagementResponseV02 value) {
        this.ntwkMgmtRspn = value;
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
    public static MxCanm00200102 parse(String xml) {
        return ((MxCanm00200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCanm00200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCanm00200102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCanm00200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCanm00200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCanm00200102 parse(String xml, MxRead parserImpl) {
        return ((MxCanm00200102) parserImpl.read(MxCanm00200102 .class, xml, _classes));
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
     * Creates an MxCanm00200102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCanm00200102 message
     * @return
     *     a new instance of MxCanm00200102
     */
    public final static MxCanm00200102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCanm00200102 .class);
    }

}
